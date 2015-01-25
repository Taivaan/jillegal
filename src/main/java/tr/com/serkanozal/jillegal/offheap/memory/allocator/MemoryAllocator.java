/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.memory.allocator;

public interface MemoryAllocator {

	long totalMemory();
	long usedMemory();
	
	long allocateMemory(long size);
	void freeMemory(long address);
	
}
