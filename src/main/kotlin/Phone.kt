class Phone {
    val LPhones = mutableListOf<PhoneClass>()

    fun findById(id: Int) : Int?{
        var findIndex: Int? = null
        for( i in 0..LPhones.size){
            if(LPhones[i].id == id){
                findIndex = i
                println("phone ${LPhones[i].model} is find")
            } else {
                findIndex = null
                println("phone isn't found")
            }
            break
        }
        return findIndex
    }

    fun insert(phone: PhoneClass) {
        phone.id = LPhones.size
        print("id: " + phone.id + " ")
        LPhones.add(phone)
        println("${phone.model} was added")
    }

    fun update(id: Int, phone: PhoneClass) {
        var searchPhone: Int? = findById(id)
        if (searchPhone != null) {
            phone.id = id
            LPhones[searchPhone] = phone
        }
    }
    fun delete(id: Int) {
        var phone: Int? = findById(id)
        if (phone != null) {
            LPhones.removeAt(phone)
        }
    }
}
