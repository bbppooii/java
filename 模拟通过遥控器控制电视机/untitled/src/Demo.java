public class Demo {
        public static void main(String[] args) {
            rjxy.Person person = new rjxy.Person("John", "Male");
            jsu.Telecontroller remote = new jsu.Telecontroller("Samsung", "Black", 10, 50);

            person.controlTV(remote, 1); // 打开电视
            person.controlTV(remote, 3); // 增加音量
            person.controlTV(remote, 4); // 改变频道
            person.controlTV(remote, 2); // 关闭电视
        }
    }

