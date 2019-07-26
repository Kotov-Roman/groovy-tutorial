package habr.tutorial

class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>()
        personList.add(null)
        personList.add(new Person())
        personList.add(null)
        personList.add(new Person())
        print personList*.toString()

    }
}
