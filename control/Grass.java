package control;

import java.text.DecimalFormat;
import java.util.Random;

public class Grass {

	public int nColumns;
	public int nRows;
	Random random= new Random();
	double cells [][] ;

	public Grass(int nColumns, int nRows) {
		super();
		this.nColumns = nColumns;
		this.nRows = nRows;
		this.random = random;
		this.cells =  new double [nColumns][nRows];
	
	}
	public void print() {
		
	
		DecimalFormat df = new DecimalFormat("#.####");
	
		for(int i=0; i < cells.length; i++) {
			
			for(int j=0; j < cells[i].length; j++) {
				
				cells[i][j] = random.nextDouble();
				System.out.print(df.format(cells[i][j]) +"\t");

			}
			System.out.println();
		
		}
		

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	class Grass1 {
		public int nColumn;
		public int nRow;
		private double [][] cells;
		private Random rand;
		
		public Grass1(int nColumn, int nRow) {
			super();
			this.rand = new Random();
			this.nColumn = nColumn;
			this.nRow = nRow;
			this.cells = new double [nRow][nColumn];
			for(int i = 0; i < nRow; i++)
			{
				for(int j = 0;j < nColumn; j++)
				{
					
					//System.out.println(rand.nextDouble());
					this.cells[i][j] = this.rand.nextDouble();
				}
			}
		}
		
		public double getCell(int i,int j) {
			return cells[i][j];
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	

}
