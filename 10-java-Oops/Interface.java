public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chess {
    void moves();
}

class Hook implements chess {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class Pawn implements chess {
    public void moves() {
        System.out.println("up");
    }
}

class Queen implements chess {
    public void moves() {
        System.out.println("up,down,left,right and diagonal9in all 4 dirn");
    }
}