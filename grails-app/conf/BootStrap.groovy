import sample.Person

class BootStrap {

    def init = { servletContext ->
	
		100.times{
			new Person(firstName:"Person${it}", lastName:"LastName${it}").save()
		}
		
		log.debug "Database fully seeded."
    }
    def destroy = {
    }
}
