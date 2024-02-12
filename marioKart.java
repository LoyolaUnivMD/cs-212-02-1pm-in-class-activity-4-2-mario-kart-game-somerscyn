

class HelloWorld {
public static class MarioKartPlayer {
    

        // data fields
        private String playerName;
        private String character;
        private int speed;
        
        // general constructor (parameterized)
        public MarioKartPlayer(String playerName, String character, int speed){
            this.playerName = playerName;
            this.character = character;
            this.speed = speed;
        }
        
        // boost method 
        public void boostSpeed(){
            speed += 10;}
        
        // display info method 
        public void displayInfo(){
            System.out.println("Name: " + playerName);
            System.out.println("Character: " + character);
            System.out.println("Speed: " + speed);
        }

    }

public static class MarioKartGame {
    public static void main(String[] args) {
  
    // creating an object aka a character here 
    MarioKartPlayer bob = new MarioKartPlayer("Bob", "Hedgehog", 15);
    MarioKartPlayer joe = new MarioKartPlayer("Joe", "Mouse", 20);
    
    // display info
    bob.displayInfo();
    joe.displayInfo();
    
    // simulate a boost for each 
    bob.boostSpeed();
    joe.boostSpeed();
    
    // display updated info
    bob.displayInfo();
    joe.displayInfo();
    
    
    }}
    
    
    
    
    
}
