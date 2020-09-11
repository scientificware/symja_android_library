package org.matheclipse.core.builtin;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.BuiltInSymbol;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IEvaluator;
import org.matheclipse.core.interfaces.IExpr;

public class SourceCodeFunctions {

	final static String GITHUB = "https://github.com/";
	final static String POM_PATH = "axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/";
	final static String SRC_PATH = "src/main/java/";

	/**
	 * Generated by class: <code>org.matheclipse.core.preprocessor.GithubSymjaFunctionLineNumber</code>
	 */
	public final static int[] LINE_NUMBER_OF_JAVA_CLASS = new int[] { //
			0, 0, 0, 128, 137, 146, 0, 0, 0, 155, //
			0, 0, 168, 178, 0, 0, 0, 0, 0, 0, 0, //
			187, 200, 136, 227, 364, 203, 0, 153, 499, 405, 694, //
			47, 92, 137, 181, 0, 0, 0, 474, 0, 558, 145, //
			31, 44, 0, 98, 130, 719, 380, 0, 561, 636, 176, //
			200, 282, 358, 454, 551, 609, 694, 657, 740, 832, 907, //
			1050, 502, 80, 128, 333, 774, 568, 904, 188, 82, 28, //
			35, 63, 0, 140, 0, 0, 52, 0, 0, 0, 0, //
			0, 0, 1801, 0, 0, 65, 111, 141, 117, 1619, 250, //
			564, 466, 251, 400, 568, 663, 735, 109, 680, 244, 873, //
			80, 76, 32, 347, 1060, 98, 0, 0, 0, 0, 272, //
			326, 299, 225, 0, 793, 879, 918, 0, 971, 1060, 0, //
			0, 1809, 121, 190, 0, 0, 47, 0, 254, 0, 452, //
			92, 0, 161, 533, 0, 489, 64, 1022, 231, 538, 247, //
			1211, 170, 0, 1186, 0, 622, 1459, 1528, 322, 200, 1209, //
			580, 670, 645, 0, 1131, 381, 414, 117, 753, 144, 248, //
			268, 893, 0, 0, 0, 0, 1286, 0, 26, 497, 1378, //
			951, 63, 277, 1816, 0, 0, 1497, 1006, 1447, 368, 430, //
			1019, 1076, 725, 0, 0, 1548, 123, 49, 109, 171, 147, //
			473, 477, 876, 1823, 791, 23, 1037, 1370, 1172, 68, 1598, //
			165, 240, 1705, 1337, 1650, 1725, 178, 2775, 19, 769, 1442, //
			1861, 1069, 52, 0, 439, 165, 52, 16, 78, 127, 1219, //
			541, 0, 538, 621, 327, 0, 0, 1748, 1893, 2000, 2041, //
			1128, 1841, 1832, 308, 82, 842, 913, 938, 1004, 0, 0, //
			0, 241, 1266, 265, 298, 1096, 1122, 0, 1411, 0, 0, //
			334, 0, 1181, 2887, 536, 31, 2094, 0, 0, 1232, 0, //
			105, 1353, 1394, 1271, 1447, 1378, 1357, 654, 1196, 2203, 2123, //
			0, 381, 13, 51, 88, 0, 747, 802, 0, 57, 1400, //
			1501, 78, 93, 55, 0, 75, 218, 333, 428, 555, 210, //
			257, 0, 1168, 1402, 387, 460, 530, 3055, 279, 1534, 410, //
			1644, 842, 670, 346, 0, 0, 1471, 1962, 260, 324, 22, //
			1362, 1873, 3193, 714, 3275, 36, 33, 0, 1733, 0, 2333, //
			1488, 1929, 2203, 2176, 2229, 2322, 1922, 2087, 1966, 0, 2273, //
			296, 0, 964, 92, 0, 1029, 0, 0, 36, 156, 1149, //
			480, 635, 1093, 2474, 299, 0, 1454, 775, 901, 0, 0, //
			480, 556, 0, 546, 2512, 2554, 1013, 1522, 14, 1595, 655, //
			1663, 410, 427, 497, 2405, 53, 67, 2448, 726, 1658, 0, //
			138, 1387, 605, 63, 151, 138, 1753, 1557, 1820, 581, 2648, //
			2730, 0, 0, 0, 567, 0, 29, 69, 0, 2099, 2056, //
			692, 447, 467, 525, 2188, 125, 0, 217, 61, 267, 314, //
			384, 425, 0, 0, 0, 0, 1605, 1980, 0, 1712, 2785, //
			2351, 901, 0, 775, 821, 0, 2517, 1835, 1980, 724, 0, //
			15, 1829, 502, 1717, 1848, 893, 0, 0, 0, 0, 248, //
			973, 0, 21, 299, 0, 678, 681, 739, 0, 845, 2573, //
			987, 658, 1044, 585, 1049, 1770, 1128, 2050, 2072, 0, 2203, //
			0, 2121, 0, 648, 0, 1067, 1824, 0, 0, 338, 0, //
			2920, 0, 369, 447, 860, 357, 918, 297, 0, 0, 76, //
			14, 46, 15, 1186, 37, 2839, 77, 230, 132, 334, 1966, //
			899, 223, 788, 844, 19, 30, 959, 2004, 39, 1046, 0, //
			558, 0, 607, 675, 0, 722, 0, 762, 2020, 0, 0, //
			0, 0, 802, 2513, 842, 510, 3016, 658, 769, 0, 209, //
			287, 247, 712, 890, 0, 3478, 2556, 3580, 2235, 2478, 1869, //
			36, 3088, 742, 2071, 0, 1978, 2027, 3163, 2273, 2358, 155, //
			3279, 3357, 0, 0, 0, 0, 0, 0, 0, 0, 0, //
			0, 0, 0, 71, 0, 330, 71, 2607, 2182, 2717, 0, //
			0, 176, 223, 33, 33, 32, 0, 0, 1007, 2030, 2181, //
			2203, 998, 1138, 3625, 2419, 2149, 0, 310, 193, 2416, 2767, //
			0, 0, 2893, 459, 1884, 2276, 941, 987, 1004, 1073, 1184, //
			545, 977, 606, 2524, 0, 2565, 1856, 2635, 611, 2741, 2515, //
			69, 0, 0, 328, 3846, 3881, 75, 3987, 81, 1071, 676, //
			2951, 2999, 0, 131, 1146, 0, 0, 2654, 28, 2745, 0, //
			382, 2338, 0, 0, 1003, 1279, 0, 3062, 2071, 0, 3410, //
			3125, 3210, 2396, 57, 29, 19, 0, 0, 0, 71, 451, //
			539, 1103, 24, 4136, 190, 2805, 3428, 2881, 0, 0, 0, //
			1326, 1385, 1471, 1531, 3279, 10, 3031, 3085, 0, 2961, 0, //
			3136, 2857, 943, 4363, 2951, 3206, 0, 0, 167, 0, 0, //
			661, 0, 3023, 0, 0, 0, 0, 2485, 0, 0, 0, //
			0, 752, 1626, 1745, 0, 1428, 58, 1303, 1203, 1257, 1460, //
			3280, 0, 1289, 1335, 323, 0, 812, 3073, 19, 77, 0, //
			0, 4689, 0, 3545, 3773, 16, 1983, 1028, 3346, 3496, 0, //
			1485, 1489, 0, 0, 3639, 3669, 1083, 749, 1865, 2514, 2632, //
			0, 32, 27, 0, 0, 2772, 3013, 0, 4751, 16, 1256, //
			1300, 0, 2604, 2752, 2927, 3083, 3153, 3240, 3393, 3978, 3405, //
			885, 0, 3223, 3488, 1109, 4304, 4348, 4259, 0, 0, 4186, //
			4288, 3736, 3857, 3770, 3928, 1010, 0, 3950, 4006, 209, 4567, //
			93, 1377, 3138, 244, 0, 3248, 0, 1547, 3297, 4885, 236, //
			0, 299, 793, 5023, 2124, 1530, 1174, 1298, 20, 12, 59, //
			92, 170, 255, 306, 449, 5054, 4366, 4395, 4059, 0, 4482, //
			0, 0, 0, 1091, 0, 2165, 0, 0, 0, 221, 0, //
			0, 1602, 0, 4487, 4714, 4775, 4919, 5025, 5172, 5105, 888, //
			2275, 5144, 3350, 5180, 0, 1389, 155, 3889, 1279, 0, 1380, //
			5274, 5347, 149, 1419, 0, 3431, 1657, 1701, 1449, 3473, 0, //
			3515, 3600, 3677, 0, 1588, 2230, 2381, 0, 5423, 5466, 0, //
			0, 0, 0, 1079, 1421, 1697, 1832, 323, 1967, 32, 165, //
			0, 4610, 4756, 1504, 133, 2487, 1246, 2657, 3525, 2760, 1356, //
			5242, 0, 0, 1537, 80, 1676, 1756, 2325, 0, 49, 892, //
			978, 0, 0, 5565, 5634, 4821, 4211, 1144, 493, 2375, 2423, //
			5333, 0, 5367, 1508, 4348, 4454, 0, 0, 228, 325, 364, //
			401, 422, 457, 478, 513, 0, 551, 600, 678, 735, 372, //
			1539, 1619, 5396, 0, 178, 5694, 4534, 0, 43, 1600, 0, //
			5050, 5005, 138, 389, 0, 4862, 0, 5556, 2496, 1839, 1873, //
			0, 0, 1181, 772, 1239, 0, 5813, 198, 0, 2131, 2205, //
			6172, 6357, 6403, 6013, 2883, 3026, 3803, 15, 645, 407, 539, //
			573, 428, 0, 795, 1929, 2027, 2700, 2527, 177, 100, 5164, //
			6132, 2682, 826, 866, 3632, 3633, 912, 928, 674, 3560, 3942, //
			0, 0, 6495, 3700, 2755, 2790, 0, 3770, 667, 0, 45, //
			51, 32, 0, 3918, 0, 1777, 0, 0, 0, 0, 4007, //
			2870, 5639, 6588, 2293, 360, 1548, 3942, 0, 4615, 0, 268, //
			4067, 2378, 2445, 2518, 997, 3991, 1272, 406, 4047, 0, 4296, //
			5860, 4111, 1322, 1199, 1264, 1326, 0, 5955, 954, 988, 1022, //
			1066, 0, 0, 2932, 3000, 0, 0, 1434, 1496, 3054, 0, //
			4139, 0, 1888, 0, 1699 };

	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			S.FunctionURL.setEvaluator(new FunctionURL());
		}
	}

	private static class FunctionURL extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.arg1().isBuiltInSymbol()) {
				IBuiltInSymbol builtin = (IBuiltInSymbol) ast.arg1();
				String url = functionURL(builtin);
				if (url != null) {
					return F.stringx(url);
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize(IAST ast) {
			return IOFunctions.ARGS_1_1;
		}
	}

	private static String buildURL(final Class<?> clazz, int line) {
		StringBuilder buf = new StringBuilder(512);
		buf.append(GITHUB);
		buf.append(POM_PATH);
		buf.append(SRC_PATH);
		String canonicalName = clazz.getCanonicalName();
		String packageName = clazz.getPackage().getName();
		String parentClass = canonicalName.substring(packageName.length() + 1);
		int index = parentClass.indexOf('.');
		if (index > 0) {
			parentClass = parentClass.substring(0, index);
		}
		String packagePath = packageName.replace('.', '/');
		buf.append(packagePath);
		buf.append('/');
		buf.append(parentClass);
		buf.append(".java#L");
		buf.append(line);
		return buf.toString();
	}

	public static String functionURL(IBuiltInSymbol builtin) {
		int ordinal = builtin.ordinal();
		if (ordinal > 0 && ordinal < LINE_NUMBER_OF_JAVA_CLASS.length) {
			int line = LINE_NUMBER_OF_JAVA_CLASS[ordinal];
			if (line > 0) {
				IEvaluator evaluator = builtin.getEvaluator();
				if (evaluator != null && evaluator != BuiltInSymbol.DUMMY_EVALUATOR) {
					Class<? extends IEvaluator> clazz = evaluator.getClass();
					return buildURL(clazz, line);
				}
			}
		}
		return null;
	}

	public static void initialize() {
		Initializer.init();
	}

	private SourceCodeFunctions() {

	}

}