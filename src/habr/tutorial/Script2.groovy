package habr.tutorial

class Buddy {
    def first
    def last

    // явно задаем сеттер
    void setFirst(first) {
        println "${this.first} is becoming ${first}"
        this.first = first
    }

    @Override
    String toString() {
        "this  ${first} ${last} end"
    }
}

Random randomGen = new Random()
10.times { println(randomGen.nextInt()) }