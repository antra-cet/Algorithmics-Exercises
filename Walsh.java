import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Walsh {
	public static void main(String[] args) throws IOException {
		// Reading the inputs
		File inputFile = new File("walsh.in");
		Scanner scanner = new Scanner(inputFile);

		// Opening the file to write the output
		File outputFile = new File("walsh.out");
		FileWriter writer = new FileWriter(outputFile);

		// Reading the first line
		long N = scanner.nextLong();
		long K = scanner.nextLong();

		for (long i = 0; i < K; i++) {
			// Reading the next K lines
			long X, Y;
			X = scanner.nextLong();
			Y = scanner.nextLong();

			Nxy coordinates = new Nxy(N, X, Y);

			// Calculating the element on the position x and y
			coordinates.calculateOutput();

			// writing it in the file
			writer.write(coordinates.getOutput().toString());
			writer.write('\n');
		}

		// Closing the scanner and the writer
		scanner.close();
		writer.flush();
		writer.close();
	}
}

class Nxy {

	/*
	 * Class that helps remember the two coorindates and the
	 */

	private long n, x, y;
	private Integer output = -1;

	public Nxy(long N, long X, long Y) {
		n = N;
		x = X;
		y = Y;
	}

	public void setOutput(int o) {
		output = o;
	}

	public void calculateOutput() {
		boolean ok, ok1, ok2;
		ok = true;

		while (n > 1) {
			ok1 = false;
			ok2 = false;

			if (x > n / 2) {
				ok1 = true;
				x = x - n / 2;
			}

			if (y > n / 2) {
				ok2 = true;
				y = y - n / 2;
			}

			if (ok1 && ok2) {
				ok = !ok;
			}

			n = n / 2;
		}

		if (ok) {
			output = 0;
		} else {
			output = 1;
		}
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getN() {
		return n;
	}

	public Integer getOutput() {
		return output;
	}
}
