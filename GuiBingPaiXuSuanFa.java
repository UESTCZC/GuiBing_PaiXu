public class GuiBingPaiXuSuanFa {

	public GuiBingPaiXuSuanFa() {
		// TODO 自动生成的构造函数存根
	}

	public GuiBingPaiXuSuanFa(int[] T, int p, int q, int r) {//有r-q+1这么多个元素
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] A = new int[n1 + 1];
		int[] B = new int[n2 + 1];
		for (int i = 0; i < A.length - 1; i++) {//分配数组，下标太容易出错了。
			A[i] = T[p + i];
		}
		for (int i = 0; i < B.length - 1; i++) {
			B[i] = T[q + i + 1];
		}
		A[n1] = (int) Double.POSITIVE_INFINITY;// 无穷大为了应对一个子数组所有数都比另一个子数组的最小值还小这种情况
		B[n2] = (int) Double.NEGATIVE_INFINITY;
		int i = 0;
		int j = 0;
		for (int k = p; k < r + 1; k++){
			if (A[i] <= B[j]) {
				T[k] = A[i];
				i++;
			} else {
				T[k] = B[j];
				j++;
			}
		}

	}
}
