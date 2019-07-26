package habr.tutorial

class ExtendedAccount extends Account {
    def debt

    ExtendedAccount(){}
    // задаем конструктор
    ExtendedAccount(name, value, debt) {
        setName(name)
        setValue(value)
        setDebt(debt)
    }

    def String toString() {
        "${name} ${value} ${debt}"
    }
}