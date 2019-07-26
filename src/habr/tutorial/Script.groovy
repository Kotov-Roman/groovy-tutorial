package habr.tutorial


def cloA = { param ->
    def cloB = { a ->
        param * 10 + a
    }(15)
}

def b = cloA(10)
println cloA(10)
println b
