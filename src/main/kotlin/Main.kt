fun main(args: Array<String>) {
    val phones = Phone()

    phones.insert(PhoneClass("Iphone XR", 128))
    phones.insert(PhoneClass("Samsung S22", 256))


    println()

    phones.findById(0)
    phones.findById(1)
    println()
    phones.delete(0)
    phones.findById(0)
    phones.findById(1)
    phones.update(1, PhoneClass("Iphone 14", 512))
    phones.findById(1)

}
