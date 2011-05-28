package view;

public class Griglia {
	
	private int [][] griglia;
	private int [] numPedine;
	private int lastCol;
	public Griglia(){
		griglia = new int [8][7];
		numPedine = new int [8];
		int j,i;
		for(j=0;j<8;j++){
			for(i=0;i<7;i++){
				griglia[j][i]=0;
			}
		}
		for(i=0;i<8;i++){
			numPedine[i]=0;
		}
		lastCol=0;
	}
	
	public void putPedina(int col,int play){
		griglia[col][numPedine[col]]=play;
		numPedine[col]++;
		lastCol=col;
	}
	
	public int getPedinaOnGriglia(int col,int h){
		return griglia[col][h];
	}
	
	public boolean isFull(){
		int i;
		for(i=0;i<8;i++){
			if (numPedine[i]<8) return false;
		}
		return true;
	}
	
	public int winner(){
		int x=lastCol;
		int y=numPedine[lastCol]-1;
		int p=griglia[x][y];
		int i,c=0;
		//controlo orizontale
		for(i=-3;i<7;i++){
			if((x+i>=0)&&(x+i<=7)){
				if (griglia[x+i][y]==p){
					c++;
					if (c==4) return p;
				}
				else c=0;
			}
		}
		//controllo verticale
		c=0;
		for(i=-3;i<4;i++){
			if((y+i>=0)&&(y+i<=6)){
				if (griglia[x][y+i]==p){
					c++;
					if (c==4) return p;
				}
				else c=0;
			}
		}
		//controllo diagonale \
		c=0;
		for(i=-3;i<7;i++){
			if((x+i>=0)&&(x+i<=7)&&(y+i>=0)&&(y+i<=6)){
				if (griglia[x+i][y+i]==p){
					c++;
					if (c==4) return p;
				}
				else c=0;
			}
		}
		//controllo diagonale /
		c=0;
		for(i=-3;i<7;i++){
			if((x+i>=0)&&(x+i<=7)&&(y-i>=0)&&(y-i<=6)){
				if (griglia[x+i][y-i]==p){
					c++;
					if (c==4) return p;
				}
				else c=0;
			}
		}
		return 0;
	}

}
