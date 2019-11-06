package csv2pq;

import java.io.File;
import java.io.IOException;

public class Cli {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			throw new IllegalArgumentException("Expected input <csv_file> <parquet_file>");
		}
		String schema = args[0].replace(".schema", ".csv");
		if (!new File(schema).exists()) {
			throw new IllegalArgumentException("Please create " + schema + " file too");
		}
		ConvertUtils.convertCsvToParquet(new File(args[0]), new File(args[1]));
	}
}
