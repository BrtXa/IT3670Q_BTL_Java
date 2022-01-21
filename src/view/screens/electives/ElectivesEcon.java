package view.screens.electives;

import view.screens.econ.EconScreen;

public class ElectivesEcon extends Electives {
    public WorkSpaceCheckBox workSpace;

    public ElectivesEcon() {
        // Passing in the array for checboxes
        String subjectList[] = {
                "<html>CSIT110<br/>Nhập môn khoa học máy tính</html>",
                "<html>CSIT111<br/>Toán kỹ thuật</html>",
                "<html>CSIT112<br/>Vật lý kỹ thuật</html>",
                "<html>CSIT113<br/>Nhập môn lập trìnhh</html>",
                "<html>CSIT114<br/>Cơ sở dữ liệu</html>",
                "<html>CSIT115<br/>Lập trình và thiết kế hướng đối tượng</html>",
                "<html>CSIT116<br/>Tương tác người - máy</html>",
                "<html>CSIT117<br/>Hệ điều hành</html>",
                "<html>CSIT119<br/>Thiết kế phần mềm</html>",
                "<html>CSIT120<br/>Cấu trúc dữ liệu và giải thuật</html>",
                "<html>HEAL110<br/>Nhập môn tâm lý học</html>",
                "<html>HEAL111<br/>Sinh học và di truyển</html>",
                "<html>HEAL112<br/>Giải phẫu</html>",
                "<html>HEAL113<br/>Hóa học</html>",
                "<html>HEAL114<br/>Sinh lý học</html>",
                "<html>HEAL115<br/>Hóa Sinh</html>",
                "<html>HEAL116<br/>Sinh học phân tử</html>",
                "<html>HEAL118<br/>Hoá phân tích</html>",
                "<html>HEAL119<br/>Lý Sinh Y học</html>",
                "<html>HEAL120<br/>Ký sinh trùng</html>" };

        // Generating and positioning checkboxes
        workSpace = new WorkSpaceCheckBox();
        workSpace.setBounds(350, 175, 930, 545);

        // Creating checkboxes and adding them to the workspace
        for (int counter = 0; counter < 10; counter++) {
            ElectiveCheckBox electiveCheckBox = new ElectiveCheckBox(subjectList[counter], 2);
            workSpace.add(electiveCheckBox);
        }

        for (int counter = 10; counter < 20; counter++) {
            ElectiveCheckBox electiveCheckBox = new ElectiveCheckBox(subjectList[counter], 3);
            workSpace.add(electiveCheckBox);
        }

        add(workSpace);
    }

    @Override
    public void backButtonPress() {
        EconScreen econScreen = new EconScreen();
        econScreen.show();

    }

}
