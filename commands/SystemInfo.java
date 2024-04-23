package commands;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;


public class SystemInfo {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
    System.out.println("Имя ОС: " + osBean.getVersion());
    OperatingSystemMXBean osCPUBean = ManagementFactory.getOperatingSystemMXBean();
    System.out.println("Модель процессора: " + osCPUBean.getAvailableProcessors());
    System.out.println("Количество ядер: " + osCPUBean.getAvailableProcessors());

    }
    

}
