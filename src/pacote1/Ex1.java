package pacote1;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Ex1 {
    public static void main(String[] args) {
        int mb = 1024 * 1024;

        // obtém o nome do OS
        String os = System.getProperty("os.name");
        System.out.println(os);

        //obtém RAM
        long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalMemorySize()/mb;
        long memoryFree = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize()/mb;


        System.out.println("Capacidade de memória RAM: "+memorySize);
        System.out.println("Memória RAM alocada: "+(memorySize - memoryFree));
        System.out.println("Memória RAM livre: "+memoryFree);
    }
}
