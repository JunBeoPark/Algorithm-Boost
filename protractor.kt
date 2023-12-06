class Solution {
    fun solution(angle: Int): Int {
        return when {
        angle > 0 && angle < 90 -> 1 // 예각
        angle == 90 -> 2 // 직각
        angle > 90 && angle < 180 -> 3 // 둔각
        angle == 180 -> 4 // 평각
        else -> -1 // 잘못된 각도 입력
    }
    }
    fun main() {
    // 테스트
    val angle1 = 45
    val angle2 = 90
    val angle3 = 120
    val angle4 = 180

    println("각 $angle1 은(는) ${solution(angle1)} 입니다.")
    println("각 $angle2 은(는) ${solution(angle2)} 입니다.")
    println("각 $angle3 은(는) ${solution(angle3)} 입니다.")
    println("각 $angle4 은(는) ${solution(angle4)} 입니다.")
}
}
