import java.util.*;

class Checker implements Comparator<Player>{
	public int compare(Player a, Player b){
		//First, checks if the Players have the same score, if so, then it'll compare by name
		if(a.score == b.score){
			return (a.name.compareTo(b.name));
		} else{
			return ((a.score < b.score) ? 1 : -1);//If the Players don't have the same score, it'll sort them by decreasing score 
		}
	}
}



class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}