package habr.tutorial

class Account {
    String name;
    BigDecimal value;

    @Override
    String toString() {
        return Arrays.asList(name, value)
    }
}

