/*Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, 
and Rugby. Override the play() method in each subclass to play a specific statement for each sport*/
public abstract class Sports {
    public abstract void play();
    public static void main(String[] args) {
        Sports[] sports = {
            new Football(),
            new Basketball(),
            new Rugby()
        };

        for (Sports s : sports) {
            s.play();
        }
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football is good");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball is amazing");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby is also good");
    }
}