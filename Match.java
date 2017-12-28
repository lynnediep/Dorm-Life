public class Match {

	public static void main(String[] args) {
		System.out.println("Enter File Name: ");
		Scanner kbd = new Scanner(System.in);
		String fileName = kbd.next();
		
		int[] score = new int[100];
		Student[] arr = new Student[100];
		
		int count = 0;
		
		try {
			Scanner input = new Scanner(new FileReader(fileName));

			while (input.hasNextLine() && count < 100) {
				//Scanner match = new Scanner(input.nextLine());
				input.useDelimiter("[-\t]");

				String name = input.next();
				char gender = input.next().charAt(0);

				int month = input.nextInt();
				int day = input.nextInt();
				int year = input.nextInt();
				int quietTime = input.nextInt();
				int music = input.nextInt();
				int read = input.nextInt();
				int chat = input.nextInt();

				Date birthday = new Date(month, day, year);
				Preference pref = new Preference(quietTime, music, read, chat);
				
				count++;
			}

			input.close();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		int i = 0, k = 0, bestScore = 0, index = 0;
		for (i = 0; i < count; i++) {
			bestScore = 0;
			if (!arr[i].getMatch()) {
				index = 0;
				bestScore = 0;

				for (k = i + 1; k < count; k++) {
					if(arr[i].getMatch()) continue;
					if(arr[k].getMatch()) continue;
					score[i] = arr[i].compare(arr[k]);

					if (score[i] > bestScore) {
						bestScore = score[i];
						index = k;
					}
				}
				if (bestScore > 0) {
					System.out.println(arr[i].getName() + " matches with "
							+ arr[index].getName() + " with the score of "
							+ bestScore + ".");
					arr[i].setMatch(true);
					arr[index].setMatch(true);
					continue;
				} else {
					System.out.println(arr[i].getName() + " has no matches. ");
					arr[i].setMatch(false);
				}
			}
		}
	}
}
