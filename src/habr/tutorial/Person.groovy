package habr.tutorial

class Person {
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
