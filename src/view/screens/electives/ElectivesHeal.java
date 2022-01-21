package view.screens.electives;

import view.screens.heal.HealScreen;

public class ElectivesHeal extends Electives {
    public WorkSpaceCheckBox workSpace;

    public ElectivesHeal() {
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
                "<html>CSIT110<br/>Nhập môn khoa học máy tính</html>",
                "<html>CSIT111<br/>Toán kỹ thuật</html>",
                "<html>CSIT112<br/>Vật lý kỹ thuật</html>",
                "<html>CSIT113<br/>Nhập môn lập trìnhh</html>",
                "<html>CSIT114<br/>Cơ sở dữ liệu</html>",
                "<html>CSIT115<br/>Lập trình và thiết kế hướng đối tượng</html>",
                "<html>CSIT116<br/>Tương tác người - máy</html>",
                "<html>CSIT117<br/>Hệ điều hành</html>",
                "<html>CSIT119<br/>Thiết kế phần mềm</html>",
                "<html>CSIT120<br/>Cấu trúc dữ liệu và giải thuật</html>" };

        // Generating and positioning checkboxes
        workSpace = new WorkSpaceCheckBox();
        workSpace.setBounds(350, 175, 930, 545);

        // Creating checkboxes and adding them to the workspace
        for (int counter = 0; counter < 10; counter++) {
            ElectiveCheckBox electiveCheckBox = new ElectiveCheckBox(subjectList[counter], 1);
            workSpace.add(electiveCheckBox);
        }

        for (int counter = 10; counter < 20; counter++) {
            ElectiveCheckBox electiveCheckBox = new ElectiveCheckBox(subjectList[counter], 2);
            workSpace.add(electiveCheckBox);
        }

        add(workSpace);
    }

    @Override
    public void backButtonPress() {
        HealScreen healScreen = new HealScreen();
        healScreen.show();

    }

}
