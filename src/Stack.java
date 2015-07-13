/**
 * ʹ������ʵ�ֶ�ջ��������ջ����ջ����ȡ��ջ���ȡ�
 * @author HL
 */
public class Stack {      
  
  Object[] data;
  
  int maxSize;  
  //ջ��λ��
  int top;      
  
  public Stack(int maxSize) {      
      this.maxSize = maxSize;      
      data = new Object[maxSize];      
      top = -1;      
  }      
   
  /**
   * ��ȡ��ջ����
   * @return ��ջ����
   */
  public int getSize()
  {
  	return maxSize;
  }
  
  /**
   * ����ջ��Ԫ�صĸ���
   * @return ջ��Ԫ�صĸ���
   */
  public int getElementCount()
  {
  	return top;
  }
  
  /**
   * �ж�ջ��
   * @return ջ��
   */
  public boolean isEmpty()
  {
  	return top == -1;
  }
  
  /**
   * �ж�ջ��
   * @return ջ��
   */
  public boolean isFull()
  {
  	return top+1 == maxSize;
  }
  
  /**    
   * ���μ�������    
   * @param data Ҫ���������ͨ��    
   * @return ����Ƿ�ɹ�    
   */      
  public boolean push(Object data) {      
    if(isFull()) 
    {      
        System.out.println("ջ����!");      
        return false;      
    }      
    this.data[++top] = data;      
    return true;      
  }      
        
  /**    
   * ��ջ��ȡ������    
   * @return ȡ��������    
   */      
  public Object pop() throws Exception{      
    if(isEmpty()) 
    {      
        throw new Exception("ջ�ѿ�!");      
    }      
    return this.data[top--];      
  }      
  
  /**
   * ����ջ��Ԫ��
   * @return
   */
  public Object peek()
  {
  	return this.data[getElementCount()];  
  }


  public static void main(String[] args) throws Exception {      
      Stack stack=new Stack(1000);      
      stack.push(new String("1"));      
      stack.push(new String("2"));      
      stack.push(new String("3"));      
      stack.push(new String("4"));      
      stack.push(new String("5"));  
      System.out.println(stack.peek()); 
            
      while(stack.top>=0)      
      {      
          System.out.println(stack.pop());      
      }             
  }      
}     