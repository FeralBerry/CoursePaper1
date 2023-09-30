public class EmployeeBook {
    private final int numberOfEmployees = 10;
    private final int countParams = 3;
    private final Object[][] employers = new Object[countParams + 1][numberOfEmployees];
    private int counter;

    public EmployeeBook() {

    }
    public StringBuilder getEmployers(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfEmployees; i++){
            for(int j = 0; j < countParams + 1;j++){
                sb.append(this.employers[j][i]).append(" ");
            }
            sb.append("\n");
        }
        return sb;
    }
    public StringBuilder getEmployersWithParam(String param){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfEmployees; i++){
            int k = -1;
            for(int j = 0; j < countParams + 1;j++){
                String str = (String) this.employers[j][i];
                if (str.contains(param)) {
                    k = i;
                    break;
                }
            }
            if(k != -1){
                for (int c = 0; c < countParams + 1;c++){
                    sb.append(this.employers[c][k])
                            .append(" ");
                    if(c == countParams){
                        sb.append("\n");
                    }
                }
            }
        }
        return sb;
    }
    public void setEmployers(String... params) {
        if(counter < numberOfEmployees){
            if(employers[0][counter] == null){
                for (int i = 0; i < countParams + 1; i++){
                    if(i == 0){
                        employers[i][counter] = String.valueOf(counter + 1);
                    }
                    if(i != 0){
                        employers[i][counter] = params[i-1];
                    }
                }
            }
        } else {
            System.out.println("Достигнут предел по количеству сотрудников");
        }
        counter++;
    }
    public void editEmployers(String search, String... params){
        int k = -1;
        for (int i = 0; i < this.employers.length; i++){
            if(i == 0 || i == 1) {
                for (int j = 0; j < this.employers[i].length; j++) {
                    assert this.employers[i][j] != null;
                    if(this.employers[i][j].equals(search)){
                        k = j;
                    }
                }
            }
        }
        if (k == -1){
            System.out.println("Таких сотрудников нет");
        } else {
            for (int i = 2;i < countParams + 1;i++){
                this.employers[i][k] = params[i-2];
            }
            System.out.println("Информация о сотруднике успешно изменена");
        }
    }
    public void deleteEmployers(String s){
        int k = -1;
        for (int i = 0; i < this.employers.length; i++){
            if(i == 0 || i == 1){
                for (int j = 0; j < this.employers[i].length; j++){
                    assert this.employers[i][j] != null;
                    if(this.employers[i][j].equals(s)){
                        k = j;
                    }
                }
            }
            if(k != -1){
                this.employers[i][k] = null;
            }
        }
        for (int i = 0; i < this.employers.length; i++){
            for (int j = 0; j < this.employers[i].length; j++){
                if(this.employers[i][j] == null && j + 1 < numberOfEmployees){
                    this.employers[i][j] = this.employers[i][j + 1];
                    this.employers[i][j+1] = null;
                }
                if(j+1<numberOfEmployees){
                    this.employers[0][j] = String.valueOf(j + 1);
                }
            }
        }
        if (k == -1){
            System.out.println("Таких сотрудников нет");
        } else {
            System.out.println("Сотрудник успешно удален");
        }
        counter--;
    }
    public void raiseYourSalary(int percent){
        for (int i = 0; i < numberOfEmployees; i++){
            for(int j = 0; j < countParams + 1;j++){
                if(j == countParams){
                    this.employers[j][i] = Float.toString(salaryIncrease(Float.parseFloat((String) this.employers[j][i]),percent));
                }
            }
        }
    }
    // raise your salary
    // Метод повышения зарплаты на %
    public static float salaryIncrease(float salary,int percent){
        return salary + salary * percent / 100;
    }
}
