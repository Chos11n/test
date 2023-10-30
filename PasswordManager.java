import java.util.HashMap; 
import java.util.Scanner; 
 
public class PasswordManager { 
    private HashMap
  
    passwords; 
 
    public PasswordManager() { 
        passwords = new HashMap<>(); 
    } 
 
    public void addPassword(String account, String password) { 
        passwords.put(account, password); 
    } 
 
    public void deletePassword(String account) { 
        passwords.remove(account); 
    } 
 
    public void updatePassword(String account, String password) { 
        passwords.put(account, password); 
    } 
 
    public String getPassword(String account) { 
         return String.valueOf(passwords.get(account)); 
    } 
 
    public void printAllPasswords() { 
        for (String account:passwords.keySet()) { 
            System.out.println(account + ": " + passwords.get(account)); 
        } 
    } 
 
    public static void main(String[] args) { 
        PasswordManager manager = new PasswordManager(); 
        Scanner scanner = new Scanner(System.in); 
 
        while (true) { 
            System.out.println("请选择操作：1.添加密码 2.删除密码 3.修改密码 4.查找密码 5.查看所有密码 6.退出"); 
            int choice = scanner.nextInt(); 
            scanner.nextLine(); 
 
            switch (choice) { 
                case 1: 
                    System.out.println("请输入账号："); 
                    String account = scanner.nextLine(); 
                    System.out.println("请输入密码："); 
                    String password = scanner.nextLine(); 
                    manager.addPassword(account, password); 
                    System.out.println("添加成功！"); 
                    break; 
                case 2: 
                    System.out.println("请输入要删除的账号："); 
                    account = scanner.nextLine(); 
                    manager.deletePassword(account); 
                    System.out.println("删除成功！"); 
                    break; 
                case 3: 
                    System.out.println("请输入要修改的账号："); 
                    account = scanner.nextLine(); 
                    System.out.println("请输入新密码："); 
                    password = scanner.nextLine(); 
                    manager.updatePassword(account, password); 
                    System.out.println("修改成功！"); 
                    break; 
                case 4: 
                    System.out.println("请输入要查找的账号："); 
                    account = scanner.nextLine(); 
                    password = manager.getPassword(account); 
                    if (password != null) { 
                        System.out.println("密码为：" + password); 
                    } else { 
                        System.out.println("账号不存在！"); 
                    } 
                    break; 
                case 5: 
                    manager.printAllPasswords(); 
                    break; 
                case 6: 
                    System.exit(0); 
                default: 
                    System.out.println("输入错误，请重新输入！"); 
            } 
        } 
    } 
} 
