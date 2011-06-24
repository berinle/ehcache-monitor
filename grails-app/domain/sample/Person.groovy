package sample

class Person {

	String firstName
	String lastName
	
    static constraints = {
		firstName(blank:false)
		lastName(blank:false)
    }

	static mapping = {
		cache true
		//cache: 'read-write'
	}
}
