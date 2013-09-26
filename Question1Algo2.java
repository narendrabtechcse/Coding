package Coursera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Question1Algo2 {

	
	public static void main(String[] args) {
		
		try {
			InputStream inputStream = System.in;
			InputReader in = new InputReader(inputStream);
			PrintWriter writer = new PrintWriter(System.out);



			TaskA solution = new TaskA();
			solution.solve(in, writer);

			writer.close();
			inputStream.close();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}

}


class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
	reader = new BufferedReader(new InputStreamReader(stream));
	tokenizer = null;
	}

	public String next() {
	while (tokenizer == null || !tokenizer.hasMoreTokens()) {
	try {
	tokenizer = new StringTokenizer(reader.readLine());
	} catch (IOException e) {
	throw new RuntimeException(e);
	}
	}
	return tokenizer.nextToken();
	}

	public int nextInt() {
	return Integer.parseInt(next());
	}

	public long nextLong() {
	return Long.parseLong(next());
	}

	public double nextDouble() {
	return Double.parseDouble(next());
	}

	}
