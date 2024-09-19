public class Students {
    private int studentCode;
    private String name;
    private float theoreticalScore;
    private float practicalScore;



    public Students(int studentCode, String name, float theoreticalScore, float practicalScore) {
        this.studentCode = studentCode;
        this.name = name;
        this.theoreticalScore = theoreticalScore;
        this.practicalScore = practicalScore;
    }

    public float averageScore() {
        return (practicalScore + theoreticalScore) / 2;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTheoreticalScore() {
        return theoreticalScore;
    }

    public void setTheoreticalScore(float theoreticalScore) {
        this.theoreticalScore = theoreticalScore;
    }

    public float getPracticalScore() {
        return practicalScore;
    }

    public void setPracticalScore(float practicalScore) {
        this.practicalScore = practicalScore;
    }

    @Override
    public String toString() {
        return String.format("MSSV: %d, Họ tên: %s, Điểm LT: %.2f, Điểm TH: %.2f, Điểm TB: %.2f",
                studentCode, name, theoreticalScore, practicalScore, averageScore());
    }
}
