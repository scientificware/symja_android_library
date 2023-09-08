package org.matheclipse.core.preprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.util.SourceCodeProperties;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.expression.WL;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.parser.ExprParser;
import org.matheclipse.core.patternmatching.RulesData;
import org.matheclipse.parser.client.ParserConfig;

/** Generate java sources for Symja rule files. */
public class RulePreprocessor {
  private static SourceCodeProperties p =
      SourceCodeProperties.of(false, false, SourceCodeProperties.Prefix.NONE, false);

  /**
   * If <code>true</code> abort rule creation, if the left-hand-side contains a variable (instead of
   * an expected pattern)
   */
  private static boolean TEST_LHS_FOR_VARIABLES = false;

  static final String PACKAGE = "package org.matheclipse.core.reflection.system.";

  static final String HEADER_CLASS = "\n" + "import static org.matheclipse.core.expression.F.*;\n" //
      + "import org.matheclipse.core.interfaces.IAST;\n" //
      + "\n" //
      + "/**\n" //
      + " * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>\n" //
      + " * <p>See GIT repository at: <a href=\"https://github.com/axkr/symja_android_library\">github.com/axkr/symja_android_library under the tools directory</a>.</p>\n" //
      + " */\n" + "public class ";

  static final String HEADER_INTERFACE = "\n"
      + "import static org.matheclipse.core.expression.F.*;\n" //
      + "import org.matheclipse.core.interfaces.ISymbol;\n" //
      + "import org.matheclipse.core.interfaces.IAST;\n" //
      + "import org.matheclipse.core.patternmatching.Matcher;\n" //
      + "\n" //
      + "/**\n" //
      + " * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>\n" //
      + " * <p>See GIT repository at: <a href=\"https://github.com/axkr/symja_android_library\">github.com/axkr/symja_android_library under the tools directory</a>.</p>\n" //
      + " */\n" + "public interface ";

  static final String HEADER_AUTO = "\n" + "import static org.matheclipse.core.expression.F.*;\n" //
      + "import org.matheclipse.core.interfaces.ISymbol;\n" //
      + "import org.matheclipse.core.interfaces.IAST;\n" //
      + "import org.matheclipse.core.patternmatching.Matcher;\n" //
      + "\n" //
      + "/**\n"
      + " * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>\n" //
      + " * <p>See GIT repository at: <a href=\"https://github.com/axkr/symja_android_library\">github.com/axkr/symja_android_library under the tools directory</a>.</p>\n"
      + " */\n" + "public class ";

  static final String SIZES = "  /**\n" + "   * <ul>\n"
      + "   * <li>index 0 - number of equal rules in <code>RULES</code></li>\n" + "	 * </ul>\n"
      + "	 */\n" + "  final public static int[] SIZES = { ";

  private static final String LIST0 = "  final public static IAST RULES";
  private static final String LIST1 = " = List(";

  static final String FOOTER0 = "  );\n";
  static final String FOOTER1 = "}";

  public RulePreprocessor() {}

  public static void appendSetDelayedToRule(IAST ast, StringBuilder buffer, boolean evalRHS,
      boolean last) {
    IExpr leftHandSide = ast.arg1();
    IExpr rightHandSide = ast.arg2();
    if (leftHandSide.isAST()) {
      if (TEST_LHS_FOR_VARIABLES && !leftHandSide.isFree(x -> x.isVariable() && //
          !x.isBuiltInSymbol(), true)) {
        throw new IllegalArgumentException(
            "Variable used in left-hand-side of rule: " + ast.toString());
      }
      leftHandSide = EvalEngine.get().evalHoldPattern((IAST) leftHandSide);
    }
    if (evalRHS) {
      rightHandSide = F.eval(rightHandSide);
    }
    buffer.append(leftHandSide.internalJavaString(p, 1, x -> null));
    buffer.append(",\n      ");
    buffer.append(rightHandSide.internalJavaString(p, 1, x -> null));
    if (last) {
      buffer.append(")\n");
    } else {
      buffer.append("),\n");
    }
  }

  public static void appendSetDelayedToMatcher(IAST ast, StringBuilder buffer, boolean evalRHS,
      boolean last) {
    IExpr leftHandSide = ast.arg1();
    IExpr rightHandSide = ast.arg2();
    if (leftHandSide.isAST()) {
      if (TEST_LHS_FOR_VARIABLES && !leftHandSide.isFree(x -> x.isVariable() && //
          !x.isBuiltInSymbol(), true)) {
        throw new IllegalArgumentException(
            "Variable used in left-hand-side of rule: " + ast.toString());
      }
      leftHandSide = EvalEngine.get().evalHoldPattern((IAST) leftHandSide);
    }
    if (evalRHS) {
      rightHandSide = F.eval(rightHandSide);
    }
    buffer.append(leftHandSide.internalJavaString(p, 1, x -> null));
    buffer.append(",\n      ");
    buffer.append(rightHandSide.internalJavaString(p, 1, x -> null));
    buffer.append(");\n");
  }

  public static void convertList(IExpr expr, String rulePostfix, StringBuilder buffer,
      final PrintWriter out, String symbolName, EvalEngine engine) {
    try {
      // if (expr.isListOfLists()) {
      // IAST list = (IAST) expr;
      // for (int i = 1; i < list.size(); i++) {
      // convertExpr(list.get(i), Integer.toString(i), out, null);
      // }
      // } else {
      convertListExpr(expr, rulePostfix, out, symbolName);
      // }
    } catch (UnsupportedOperationException uoe) {
      System.out.println(uoe.getMessage());
      System.out.println(expr.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static byte[] convertListSerialized(IExpr expr, StringBuilder buffer,
      final PrintWriter out, EvalEngine engine) {
    try {
      return convertSerialized(expr, out);
    } catch (UnsupportedOperationException uoe) {
      System.out.println(uoe.getMessage());
      System.out.println(expr.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void convert(IExpr expr, String rulePostfix, final PrintWriter out,
      String symbolName, boolean createMatcher, EvalEngine engine) {
    try {

      if (expr.isListOfLists()) {
        IAST list = (IAST) expr;
        for (int i = 1; i < list.size(); i++) {
          if (createMatcher) {
            convertToMatcher(list.get(i), Integer.toString(i), out, null, engine);
          } else {
            convertToRule(list.get(i), Integer.toString(i), out, null, engine);
          }
        }
      } else {
        if (createMatcher) {
          convertToMatcher(expr, rulePostfix, out, symbolName, engine);
        } else {
          convertToRule(expr, rulePostfix, out, symbolName, engine);
        }
      }
    } catch (UnsupportedOperationException uoe) {
      System.out.println(uoe.getMessage());
      System.out.println(expr.toString());
    }
  }

  private static void convertToRule(IExpr expr, String rulePostfix, final PrintWriter out,
      String symbolName, EvalEngine engine) {
    boolean last;
    StringBuilder buffer = new StringBuilder();
    // ArraySet<ISymbol> headerSymbols = new ArraySet<ISymbol>();
    if (expr.isAST()) {
      IAST list = (IAST) expr;
      if (symbolName != null) {
        int equalsRuleCounter = 0;
        int simpleRuleCounter = 0;
        for (int i = 1; i < list.size(); i++) {
          last = i == (list.argSize());
          expr = list.get(i);
          if (expr.isAST(S.SetDelayed, 3)) {
            IAST ast = (IAST) expr;
            if (!RulesData.isComplicatedPatternRule(ast.arg1())) {
              simpleRuleCounter++;
            }
          } else if (expr.isAST(S.Set, 3)) {
            equalsRuleCounter++;
          }
        }
        if (equalsRuleCounter > 0 || simpleRuleCounter > 0) {
          out.print(SIZES);
          out.append(Integer.toString(equalsRuleCounter));
          out.append(", ");
          out.append(Integer.toString(simpleRuleCounter));
          out.append(" };\n\n");
          buffer.append("    IInit(");
          buffer.append(symbolName);
          buffer.append(", SIZES),\n");
        }
      }

      for (int i = 1; i < list.size(); i++) {
        last = i == (list.argSize());
        expr = list.get(i);
        if (expr.isAST(S.SetDelayed, 3)) {
          IASTMutable ast = ((IAST) expr).copy();
          if (ast.arg1().isAST()) {
            // if (ast.arg1().isAST(S.Sum)) {
            // HoldAll in Sum prevents evaluation in evalHoldPattern
            // System.out.println(ast.arg1().toString());
            // }
            ast.set(1, engine.evalHoldPattern((IAST) ast.arg1()));
          }
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");

          buffer.append("    ISetDelayed(");

          appendSetDelayedToRule(ast, buffer, false, last);
        } else if (expr.isAST(S.Set, 3)) {
          IASTMutable ast = ((IAST) expr).copy();
          if (ast.arg1().isAST()) {
            ast.set(1, engine.evalHoldPattern((IAST) ast.arg1()));
          }
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");

          buffer.append("    ISet(");

          appendSetDelayedToRule(ast, buffer, true, last);
        } else if (expr.isAST(S.Rule, 3)) {
          IASTMutable ast = ((IAST) expr).copy();
          if (ast.arg1().isAST()) {
            ast.set(1, engine.evalHoldPattern((IAST) ast.arg1()));
          }
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");
          buffer.append("    Rule(");
          appendSetDelayedToRule(ast, buffer, true, last);
        }
      }
    } else {
      if (expr.isAST(S.SetDelayed, 3)) {
        IAST ast = (IAST) expr;

        buffer.append("    ISetDelayed(");

        appendSetDelayedToRule(ast, buffer, false, true);
      } else if (expr.isAST(S.Set, 3)) {
        IAST ast = (IAST) expr;

        buffer.append("    ISet(");

        appendSetDelayedToRule(ast, buffer, true, true);
      } else if (expr.isAST(S.Rule, 3)) {
        IAST ast = (IAST) expr;
        buffer.append("    Rule(");
        appendSetDelayedToRule(ast, buffer, true, true);
      }
    }
    out.print(LIST0);
    out.print(rulePostfix);
    out.println(LIST1);
    out.print(buffer.toString());
    out.print(FOOTER0);
  }

  private static void convertToMatcher(IExpr expr, String rulePostfix, final PrintWriter out,
      String symbolName, EvalEngine engine) {
    boolean last;
    StringBuilder buffer = new StringBuilder();
    StringBuilder symbolBuffer = new StringBuilder();
    // ArraySet<ISymbol> headerSymbols = new ArraySet<ISymbol>();
    if (expr.isAST()) {
      IAST list = (IAST) expr;

      for (int i = 1; i < list.size(); i++) {
        last = i == (list.argSize());
        expr = list.get(i);
        if (expr.isSymbol()) {
          String name = expr.toString();
          symbolBuffer
              .append("\n  public final static ISymbol " + name + " = Dummy(\"" + name + "\");\n");
        } else if (expr.isAST(S.SetDelayed, 3)) {
          IASTMutable ast = ((IAST) expr).copy();
          if (ast.arg1().isAST()) {
            ast.set(1, engine.evalHoldPattern((IAST) ast.arg1()));
          }
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");
          buffer.append("matcher.caseOf(");
          appendSetDelayedToMatcher(ast, buffer, false, last);
        } else if (expr.isAST(S.Set, 3)) {
          IASTMutable ast = ((IAST) expr).copy();
          if (ast.arg1().isAST()) {
            ast.set(1, engine.evalHoldPattern((IAST) ast.arg1()));
          }
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");
          buffer.append("matcher.caseOf(");
          appendSetDelayedToMatcher(ast, buffer, true, last);
        } else if (expr.isAST(S.Rule, 3)) {
          throw new UnsupportedOperationException();
        }
      }
    } else {
      if (expr.isSymbol()) {
        String name = expr.toString();
        symbolBuffer
            .append("\n  public final static ISymbol " + name + " = Dummy(\"" + name + "\");\n");
      } else if (expr.isAST(S.SetDelayed, 3)) {
        IAST ast = (IAST) expr;
        buffer.append("matcher.caseOf(");
        appendSetDelayedToMatcher(ast, buffer, false, true);
      } else if (expr.isAST(S.Set, 3)) {
        IAST ast = (IAST) expr;
        buffer.append("matcher.caseOf(");
        appendSetDelayedToMatcher(ast, buffer, true, true);
      } else if (expr.isAST(S.Rule, 3)) {
        throw new UnsupportedOperationException();
      }
    }

    out.print(symbolBuffer.toString());
    out.print("public static Matcher init");
    out.print(rulePostfix);
    out.print("() {\n");
    out.print("  Matcher matcher = new Matcher();");
    out.print(buffer.toString());
    out.print("return matcher;\n");
    out.print("}\n");
  }

  private static void convertListExpr(IExpr expr, String rulePostfix, final PrintWriter out,
      String symbolName) {
    boolean last;
    StringBuilder buffer = new StringBuilder();
    // ArraySet<ISymbol> headerSymbols = new ArraySet<ISymbol>();
    if (expr.isAST()) {
      IAST list = (IAST) expr;
      if (symbolName != null) {
        int equalsRuleCounter = 0;
        int simpleRuleCounter = 0;
        for (int i = 1; i < list.size(); i++) {
          last = i == (list.argSize());
          expr = list.get(i);
          if (expr.isAST(S.SetDelayed, 3)) {
            IAST ast = (IAST) expr;
            if (!RulesData.isComplicatedPatternRule(ast.arg1())) {
              simpleRuleCounter++;
            }
          } else if (expr.isAST(S.Set, 3)) {
            equalsRuleCounter++;
          }
        }
        // if (equalsRuleCounter > 0 || simpleRuleCounter > 0) {
        // out.print(SIZES);
        // out.append(Integer.toString(equalsRuleCounter));
        // out.append(", ");
        // out.append(Integer.toString(simpleRuleCounter));
        // out.append(" };\n\n");
        // buffer.append(" IInit(");
        // buffer.append(symbolName);
        // buffer.append(", SIZES),\n");
        // }
      }

      for (int i = 1; i < list.size(); i++) {
        last = i == (list.argSize());
        expr = list.get(i);
        if (expr.isAST(S.SetDelayed, 3)) {
          IAST ast = (IAST) expr;
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");
          buffer.append("    SetDelayed(");
          appendSetDelayedToRule(ast, buffer, false, last);
        } else if (expr.isAST(S.Set, 3)) {
          IAST ast = (IAST) expr;
          buffer.append("    // " + ast.toString().replaceAll("\\n", "") + "\n");
          buffer.append("    Set(");
          appendSetDelayedToRule(ast, buffer, true, last);
          // } else if (expr.isAST(F.Rule, 3)) {
          // IAST ast = (IAST) expr;
          // buffer.append(" // " + ast.toString().replaceAll("\\n", "") + "\n");
          // buffer.append(" Rule(");
          // appendSetDelayedToBuffer(ast, buffer, true, last);
        }
      }
      // } else {
      // if (expr.isAST(F.SetDelayed, 3)) {
      // IAST ast = (IAST) expr;
      // buffer.append(" SetDelayed(");
      // appendSetDelayedToBuffer(ast, buffer, false, true);
      // } else if (expr.isAST(F.Set, 3)) {
      // IAST ast = (IAST) expr;
      // buffer.append(" ISet(");
      // appendSetDelayedToBuffer(ast, buffer, true, true);
      // } else if (expr.isAST(F.Rule, 3)) {
      // IAST ast = (IAST) expr;
      // buffer.append(" Rule(");
      // appendSetDelayedToBuffer(ast, buffer, true, true);
      // }
    }
    out.print(LIST0);
    out.print(rulePostfix);
    out.println(LIST1);
    out.print(buffer.toString());
    out.print(FOOTER0);
  }

  private static byte[] convertSerialized(IExpr expr, final PrintWriter out) {
    if (expr.isAST()) {
      IAST list = (IAST) expr;
      IASTAppendable list2 = F.ListAlloc(list.size());
      for (int i = 1; i < list.size(); i++) {
        expr = list.get(i);
        if (expr.isAST(S.SetDelayed, 3)) {
          list2.append(expr);
        } else if (expr.isAST(S.Set, 3)) {
          list2.append(expr);
        }
      }
      return WL.serializeInternal(list2);
    }
    out.print("Error in serializeing " + expr.toString());
    return null;
  }

  public static IExpr parseFileToList(File file, EvalEngine engine) {
    try {
      final BufferedReader f = new BufferedReader(new FileReader(file));
      final StringBuilder buff = new StringBuilder(1024);
      String line;
      while ((line = f.readLine()) != null) {
        buff.append(line);
        buff.append('\n');
      }
      f.close();
      String inputString = buff.toString();
      ExprParser p = new ExprParser(engine, true);
      return p.parse(inputString);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Generate Java files (*.java) from Symja rule files (*.m)
   *
   * @param sourceLocation source directory for rule (*.m) files
   * @param targetLocation target directory for the generated Java files
   * @param createMatcher
   * @param ignoreTimestamp if <code>false</code> only change the target file (*.java), if the
   *        source file (*.m) has a newer time stamp than the target file.
   */
  public static void generateFunctionStrings(final File sourceLocation, File targetLocation,
      boolean createMatcher, boolean ignoreTimestamp) {
    if (sourceLocation.exists()) {
      PrintWriter automaticRules = null;
      File automaticRulesFile = new File(targetLocation, "AutomaticRules" + ".java");
      if (!createMatcher) {
        try {
          automaticRules = createAutoHeader("AutomaticRules", automaticRulesFile, createMatcher);
          automaticRules.println("  public static void initialize() {");
          automaticRules.println("    IAST rules = null;");
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      // Get the list of the files contained in the package
      final String[] files = sourceLocation.list();
      if (files != null) {
        StringBuilder buffer;
        EvalEngine engine = new EvalEngine(true);
        for (int i = 0; i < files.length; i++) {
          File sourceFile = new File(sourceLocation, files[i]);
          // we are only interested in .m files
          if (files[i].endsWith(".m")) {
            IExpr expr = parseFileToList(sourceFile, engine);

            if (expr == null) {
              System.err.println();
              System.err.println("Abort after not parsed expression.");
              return;
            } else {
              buffer = new StringBuilder(100000);
              PrintWriter out;
              try {
                String className = files[i].substring(0, files[i].length() - 2);
                String symbolName = className.substring(0, className.length() - 5);

                if (!createMatcher) {
                  automaticRules.println("    rules = " + className + ".RULES;");
                }

                File targetFile = new File(targetLocation, className + ".java");
                if (targetFile.exists()) {
                  if (!ignoreTimestamp
                      && (sourceFile.lastModified() <= targetFile.lastModified())) {
                    // only copy if timestamp is newer than
                    // existing ones
                    continue;
                  }
                }
                System.out.println(className);
                if (className.equals("FunctionExpandRules")
                    || className.equals("FunctionRangeRules")
                    || className.equals("PodDefaultsRules")) {
                  out = createHeader(className, targetFile, createMatcher);
                  convertList(expr, "", buffer, out, symbolName, engine);
                  out.println(FOOTER1);
                  out.close();
                } else {
                  out = createHeader(className, targetFile, createMatcher);
                  convert(expr, "", out, symbolName, createMatcher, engine);
                  out.println(FOOTER1);
                  out.close();
                }
                // } catch (IOException e) {
                // e.printStackTrace();
              } catch (Exception e) {
                System.err.println();
                System.err.println("Abort after exception.");
                e.printStackTrace();
                return;
              }
            }
          }
        }
      }
      if (!createMatcher) {
        automaticRules.println("  }");
        automaticRules.println(FOOTER1);
        automaticRules.close();
      }
    } else {
      System.out.println("source location doesn't exists: " + sourceLocation.toString());
    }
  }

  private static PrintWriter createAutoHeader(String className, File targetFile, boolean useSets)
      throws FileNotFoundException, IOException {
    PrintWriter out;
    out = new PrintWriter(targetFile.getCanonicalPath());
    out.print(PACKAGE);
    if (useSets) {
      out.print("rulesets;\n");
    } else {
      out.print("rules;\n");
    }
    out.print(HEADER_AUTO);
    out.print(className);
    out.print(" {\n");
    return out;
  }

  private static PrintWriter createHeader(String className, File targetFile, boolean useSets)
      throws FileNotFoundException, IOException {
    PrintWriter out;
    out = new PrintWriter(targetFile.getCanonicalPath());
    out.print(PACKAGE);
    if (useSets) {
      out.print("rulesets;\n");
      out.print(HEADER_INTERFACE);
    } else {
      out.print("rules;\n");
      out.print(HEADER_CLASS);
    }

    out.print(className);
    out.print(" {\n");
    return out;
  }

  public static void generateFunctionSerialized(final File sourceLocation, File targetLocation,
      boolean ignoreTimestamp) {
    if (sourceLocation.exists()) {
      // Get the list of the files contained in the package
      final String[] files = sourceLocation.list();
      if (files != null) {
        StringBuilder buffer;
        EvalEngine engine = new EvalEngine(true);
        for (int i = 0; i < files.length; i++) {
          File sourceFile = new File(sourceLocation, files[i]);
          // we are only interested in .m files
          if (files[i].endsWith(".m")) {
            IExpr expr = parseFileToList(sourceFile, engine);

            if (expr == null) {
              System.err.println();
              System.err.println("Abort after not parsed expression.");
              return;
            } else {
              buffer = new StringBuilder(100000);
              // PrintWriter out;
              try {
                String className = files[i].substring(0, files[i].length() - 2);
                String symbolName = className.substring(0, className.length() - 5);
                File targetFile = new File(targetLocation, className + ".bin");
                if (targetFile.exists()) {
                  if (!ignoreTimestamp
                      && (sourceFile.lastModified() <= targetFile.lastModified())) {
                    // only copy if timestamp is newer than
                    // existing ones
                    continue;
                  }
                }
                System.out.println(className);
                if (className.equals("FunctionExpandRules")) {
                  // || className.equals("PodDefaultsRules")) {
                  try (PrintWriter out = new PrintWriter(targetFile.getCanonicalPath())) {
                    byte[] binaryData = convertListSerialized(expr, buffer, out, engine);
                    com.google.common.io.Files.write(binaryData, targetFile);
                  }
                }
              } catch (Exception e) {
                System.err.println();
                System.err.println("Abort after exception.");
                e.printStackTrace();
                return;
              }
            }
          }
        }
      }
    }
  }

  public static void main(final String[] args) {
    ParserConfig.EXPLICIT_TIMES_OPERATOR = true;

    // Slot is considered as variable if we enable this check the processor will
    // fail:
    // TEST_LHS_FOR_VARIABLES = true;

    F.initSymbols();

    System.out.println("Generate Java source files from rule definitions");

    String userHome = System.getProperty("user.home");
    File sourceLocation =
        new File(userHome + "/git/symja_android_library/symja_android_library/rules/");
    File javaTargetLocation = new File(userHome
        + "/git/symja_android_library/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/reflection/system/rules");
    generateFunctionStrings(sourceLocation, javaTargetLocation, false, true);

    sourceLocation =
        new File(userHome + "/git/symja_android_library/symja_android_library/rule_sets/");
    javaTargetLocation = new File(userHome
        + "/git/symja_android_library/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/reflection/system\\rulesets");
    generateFunctionStrings(sourceLocation, javaTargetLocation, true, true);
    //
    // System.out.println("Generate binary serialized files in internal format from rule
    // definitions");
    // File binTargetLocation =
    // new File("..\\symja_android_library\\matheclipse-core\\src\\main\\resources\\rules");
    // generateFunctionSerialized(sourceLocation, binTargetLocation, true);
  }
}
