package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public static List<String[]> readCSVfile(String filename) {		
		List<String[]>rows = new ArrayList<String[]>();
		BufferedReader br;
		String datarow;
		try {
			br = new BufferedReader(new FileReader(filename));
			while ((datarow = br.readLine())!=null) {
				String[] line = datarow.split(",");
				rows.add(line);
			}	
		} catch (IOException e) {			
			e.printStackTrace();
		}
			
		return rows;
	}

}
