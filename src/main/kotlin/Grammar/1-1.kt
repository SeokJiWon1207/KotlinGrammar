package Grammar

fun main(args: Array<String>) {
    /**
     * var: 가변(Mutable) 변수로, 값의 읽기와 쓰기가 모두 허용되는 변수, 변수(Variable)의 약자이다.
     * var로 지정된 가변 타입 변수는 초기화 후 값을 변경이 가능하다.
     * 하지만, 다른 타입의 값을 넣을 수는 없다. 처음에 String 타입으로 초기화를 한뒤 Int 타입의 값을 넣을수는 없다.
     * 그렇다고 해당 변수를 뒤에서 Int 타입으로 재정의 한다면 타입 미스매치(Type mismatch) Error가 발생한다.
     * 이미 정의된 타입을 변경하려면 자바와 같이 형변환을 해야한다.(cast)

     * val: 불변(Immutable) 변수로, 값의 읽기만 허용되는 변수, 값(Value)의 약자이다.
     * val로 지정된 불변 타입 변수는 초기에 값을 할당되면 나중에 값을 변경할 수 없다. 강제로 변수를 변경하려고 한다면 컴파일 에러가 발생한다.
     * 즉, 값을 초기화만 가능하고 변경은 불가능하다. Java에서는 final과 같다.
     * val은 한번만 초기화 되며 값을 변경할 수 없지만 컴파일러가 코드 문맥을 확인시 val 변수가 한번만 초기화 되는것이 맞다면 개발자가 상황에 따라 val를 여러 값으로 초기화(할당) 할 수 있다. (ex) flow에서 update
     * val은 초기화 후 값을 변경이 불가능한 것이 맞지만 변수의 참조가 가리키는 객체의 내부 값은 변경이 가능하다.
     */
    var name: String = "SeokJiWon" // 변수 뒤에 ":"은 자료형을 나타내며 var name = "SeokJIWon"과 같이 선언해도 자료형 추론을 해서 선언이 가능하다.
    val age: Int = 29

    println(name) // "SeokJiWon" 출력

    name = "JiWonSeok" // var로 선언된 변수이므로, 값의 변경이 가능하다.
//    age = 30 // val로 선언된 변수이므로, 값의 변경이 불가능하며 컴파일 에러가 발생

    println(name) // 값을 재할당한 "JiWonSeok"이 출력된다.

    /**
     * 비교 연산자
     * Operator	    Description	        Example
     *     ==	        같음	            a == b
     *     !=	        다름	            a != b
     *     <       왼쪽 변수가 더 작음	    a < b
     *     >	   왼쪽 변수가 더 큼	    a > b
     *     <=	 왼쪽 변수가 더 작거나 같음	a <= b
     *     >=	 왼쪽 변수가 더 크거나 같음	a >= b
     *     ===	      객체가 같음	        a === b
     *     !==	      객체가 다름	        a !== b
     */

    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int형이 되어 값이 동일하므로 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교해 다른 객체(= 주소가다름)이므로 false
    println(c === d) // 값의 내용도 같고 참조된 객체도 동일(= 주소가같음)하므로 true

    /**
     * 산술 연산자
     * Operator	Description	Example
     *     +	    덧셈	      a+b
     *     -	    뺄셈	      a-b
     *     *	    곱셈	      a*b
     *     /	    나눗셈	  a/b
     *     %	    나머지 연산  a%b
     */
    var num1 = 5
    var b = 3

    var sum = a + b 		// 8
    var difference = a - b 		// 2
    var product = a * b 		// 15
    var quotient = a / b 		// 1
    var remainder = a % b 		// 2

    /**
     * 복합대입 연산자
     *  Operator	        Description	                    Example
     *     +=       a=a+b, a에 b를 더한 결과를 a에 할당            a+=b
     *     -=       a=a-b, a에 b를 뺀 결과를 a에 할당             a-=b
     *     *=       a=a*b, a에 b를 곱한 결과를 a에 할당            a*=b
     *     /=       a=a/b, a에 b를 나눈 결과를 a에 할당            a/=b
     *     %=       a=a%b, a에 b를 나머지 연산 결과를 a에 할당       a%=b
     */

    // 복합대입 연산자
    var a = 5
    var b = 3

    a += b 			// a = 8
    b -= 2			// b = 1
    a *= b 			// a = 8
    b /= 2 			// b = 0
    a %= 3 			// a = 2

    /**
     * 증감 연산자
     * Operator	        Description	       Example
     *    ++	           1씩 증가	       a++, ++a
     *    --	           1씩 감소	       a--, --a
     *  연산자를 어디에 붙이느냐에 따라 값이 달라지는데, ++a같이 연산자를 앞에 붙일 경우, +연산이 먼저 시작되고 그다음에 값이 할당된다.
     *  반면, a++같이 연산자를 뒤에 붙일 경우, a의 값이 먼저 할당 된 후, +연산이 나중에 시작된다.
     */

    // 증감 연산자
    var a = 5
    var b = ++a

    println(a) // a = 6
    println(b) // b = 6

    /**
     * 논리 연산자
     * Operator	        Description	        Example
     *    &&	        논리 곱 (AND)	        a && b
     *    ||	        논리 합 (OR)	        a || b
     *    !	            논리 부정 (NOT)	      !a
     *  && 연산자는 두 개의 식이 모두 true일 때만 true를 반환하며, 그 외의 경우는 false를 반환한다.
     *  || 연산자는 두 개의 식 중 하나 이상이 true일 때 true를 반환하며, 모두 false일 경우일 때만 false를 반환한다.
     *  ! 연산자는 식의 결과가 true이면 false, false이면 true를 반환한다.
     */

    // 논리 연산자
    var a = true
    var b = false

    println(a && b) 			// false
    println(a || b) 			// true
    println(!a)     			// false
}