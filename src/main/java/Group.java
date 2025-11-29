public class Group {
    public String groupName;
    public String groupID;
    int membersCount = 0;
    User[] members = new User[3];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addMembers(User user){
        members[membersCount] = user;
        membersCount++;
    }

}