import org.codehaus.groovy.runtime.InvokerHelper
class Main extends Script {                     
    def run() {                                 
        println 'Groovy world!'  

		def x = 0
		for ( i in 0..9 ) {
			x += i
			println x
		}
    }
    static void main(String[] args) {           
        InvokerHelper.runScript(Main, args)     
    }
}

