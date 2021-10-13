class Card_game {
    public static void main(String[] args) {
      String[] type = {"c", "d", "h", "s"}; //initialising the type of the deck in a String array named 'type'
      String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A"}; //initialising the num of the deck in a String array named 'num'

        // initialize deck
        int n = type.length * num.length; // a deck consists of 4*13 cards
        String[] deck = new String[n]; //
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < type.length; j++) {
                deck[type.length*i + j] = num[i] + type[j];
            } 
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i)); //using random function
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp; //swapping and shuffling
        }
        int player_no=1;
        // print shuffled deck
        for (int i = 0; i < n; i++){
            if(i%13==0)
                System.out.print("\nPlayer #"+ player_no++ + ":\t");

            System.out.print(deck[i]+ "\t"); //displaying a random card           
            
        }
    }

}