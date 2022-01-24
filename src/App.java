public class App {
    public static void main(String[] args) throws Exception {
        /* 기본 자료형 변수 8개 */
        // 정수형 byte, short, int, long & 문자형 char 글자하나 입력시
        System.out.println("byte 입력범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE );
        System.out.println("short 입력범위: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 입력범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 입력범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        // 실수형 float, double
        System.out.println("float 입력범위: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 입력범위: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        // 불린형(참,거짓) boolean
        System.out.println("boolean 입력범위: " + Boolean.FALSE + " ~ " + Boolean.TRUE);
        
        /* 참조형 변수 4개 */
        // 클래스: Class, 인터페이스: Interface, 배열: Array, 열거: Enum
        
        /* 상수 */
        final int SALE_NO = 20220123;
        System.out.println("나 상수:" + SALE_NO + "값은 리터럴이라고 말함");

        /* 명시적 형변환 */
        int i = 128;
        System.out.println("int -> byte 형변환: " + (byte) i);

        /* 산술연산자 */
        // 덧셈 + , 빼기 - , 곱하기 * , 나누기 / , 나머지 %
        System.out.println("더하기: " + (5 + 5));
        System.out.println("빼기: " + (5 - 4));
        System.out.println("곱하기: " + (5 * 3));
        System.out.println("나누기: " + (5 / 2));
        System.out.println("나머지: " + (5 % 2));
        
        /* 자동증감 연산자 */
        int plus = 5;
        System.out.println("전취증가: " + plus++);
        System.out.println("후취증가: " + ++plus);
        int minus = 5;
        System.out.println("전취감소: " + minus--);
        System.out.println("후취감소: " + --minus);

        /* 프로그램용 특수문자 */
        // 탭 \t , 줄바꿈 \n , 백스페이스 \b , carriage return \r , single quotation \' , double quotation \" , unicode \\
        System.out.println("Hello\tworld");
        System.out.println("Hello\nworld");
        System.out.println("Hello\bworld");
        System.out.println("Hello\rworld");
        System.out.println("Hello\'world");
        System.out.println("Hello\"world");
        System.out.println("Hello\\world");

        /* 삼항연산자 */
        boolean trueFlag = true;
        boolean falseFlag = false;
        System.out.println(trueFlag ? falseFlag : trueFlag);

        /* 제어문 */
        int value = 6;
        if(value > 5) {
            System.out.println("value bigger than 5");
        } else if(value < 5) {
            System.out.println("value small than 5");
        } else {
            System.out.println("value is 5");
        }

        /* 제어문&연산자 조합 */
        if(value == 6) {
            System.out.println("value is 6");
        }
        if(value != 6) {
            System.out.println("value is not 6");
        }
        if(value != 6) {
            System.out.println("value is not 6");
        }

        /* 1차배열 */
        int[] arr = new int[5];
        int arr2[] = new int[5];

        for(int ai = 0; ai < 5; ai++) {
            System.out.println(arr[ai] = ai);
            System.out.println(arr2[ai] = ai);
        }

        /* 2차배열 */
        int[][] arr3 = new int[2][5];
        for(int bi = 0; bi < 5; bi++) {
            arr3[0][bi] = bi;
            arr3[1][bi] = bi + bi;
            System.err.println(arr3[0][bi]);
            System.err.println(arr3[1][bi]);
        }

        /* 배열복사 */
        int[] arr4 = arr.clone();
        for(int ci = 0; ci < arr4.length; ci++) {
            System.out.println(arr4[ci]);
        }

        /* 생성자 클래스호출 */
        TestClass testClass = new TestClass("이재학", "30살", "백수를 꿈꾸는 사람");
        testClass.introduce();
    }
}
