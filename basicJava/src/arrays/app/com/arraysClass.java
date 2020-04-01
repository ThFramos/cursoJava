package arrays.app.com;

public class arraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] filmes = { "Marvel", "Thor", "Guerra Mundial" };
		String filmes2 = "Thor";
		int x = 0, y;

		/*
		 * if (filmes[0].equals(filmes2)) { System.out.println("bom filme");; }else
		 * if(filmes[1].equals(filmes2)) {System.out.println("bom filme");} else
		 * if(filmes[2].equals(filmes2)) {System.out.println("bom filme");} else
		 * {System.out.println("não encontrado");}
		 * 
		 */
		for (x = 0; x <= 3; x++) {

			if (filmes[x].equals(filmes2)) {

				System.out.println("bom filme");
				y = 1;
				break;

			}

		}

		System.out.println("não encontrado");
	}
}
