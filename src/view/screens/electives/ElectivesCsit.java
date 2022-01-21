package view.screens.electives;

import view.screens.csit.CsitScreen;

public class ElectivesCsit extends Electives {
    public WorkSpaceCheckBox workSpace;

    public ElectivesCsit() {
        // Passing in the array for checboxes
        String subjectList[] = {
                "<html>ECON110<br/>Kinh tế vĩ mô</html>",
                "<html>ECON111<br/>Kinh tế vi mô</html>",
                "<html>ECON113<br/>Pháp luật đại cương</html>",
                "<html>ECON114<br/>Quản lý kinh doanh</html>",
                "<html>ECON115<br/>Kinh tế lượng</html>",
                "<html>ECON116<br/>Nguyên lý kế toán</html>",
                "<html>ECON117<br/>Lý thuyết tiền tệ</html>",
                "<html>ECON118<br/>Kiểm toán căn bản</html>",
                "<html>ECON119<br/>Tài chính doanh nghiệp</html>",
                "<html>ECON120<br/>Tài chính quốc tế</html>",
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
            ElectiveCheckBox electiveCheckBox = new ElectiveCheckBox(subjectList[counter], 1);
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
        CsitScreen csitScreen = new CsitScreen();
        csitScreen.show();

    }

}
