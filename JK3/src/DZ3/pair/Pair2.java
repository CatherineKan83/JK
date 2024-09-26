package DZ3.pair;

public record Pair2<T1, T2>(T1 first, T2 second) {
    // Конструктор, геттеры, equals(), hashCode() и toString() генерируются автоматически


    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }

    @Override
    public String toString() {
        return "Pair with first=" + first + " and second=" + second;
    }
}

