public class TimFromMarketing {
    public String print(Integer id, String name, String department) {
        String deptPosition = department != null ? department : "owner";
        return id != null ?
                String.format("[%d] - %s - %S", id, name, deptPosition) :
                String.format("%s - %S", name, deptPosition);
    }
}
