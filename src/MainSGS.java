import java.util.Scanner;
public class MainSGS {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        System.out.println("=========��ӭ�������������ɱ=========");
        System.out.println("======================================");
        System.out.println("����ɱ��һ�����������Ϊ����������");
        System.out.println("���������ɱ��һ����Java�����Ŀ���̨��Ϸ����");
        System.out.println("----�佫�б�----");
        int cardcount=104;
        String[][] cardArray=new String[104][2];
        for(int j=0;j<cardcount;j++){
        	if(j<42){
        		if(j<21){
        		     cardArray[j][0]="����";
        		}else{
        			 cardArray[j][0]="÷��";
        		}
        		cardArray[j][1]="ɱ";
        	}else if(j<84){
        		cardArray[j][0]="����";
        		cardArray[j][1]="��";
        	}else if(j<cardcount){
        		cardArray[j][0]="����";
        		cardArray[j][1]="��";
        		}
        }
        String[][] wujiangArray={{"����","4","�ʵ�"},{"����","4","����"},
        		                {"�ܲ�","4","����"},{"�ĺ","4","����"},
        		                 {"��Ȩ","4","�ƺ�"},{"���","3","����"}};
        for(int i=0;i<wujiangArray.length;i++){
        	System.out.println((i+1)+"."+wujiangArray[i][0]+
        	                      "\tѪ����"+wujiangArray[i][1]+"\t���ܣ�"+wujiangArray[i][2]);
        }
        System.out.print("������Ҫѡ����佫�������:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num==1){
        	System.out.println("��ѡ��������������Ϸ");
        }else if(num==2){
        	System.out.println("��ѡ�������ƽ�����Ϸ");
        }else if(num==3){
        	System.out.println("��ѡ���˲ܲٽ�����Ϸ");
        }else if(num==4){
        	System.out.println("��ѡ�����ĺ������Ϸ");
        }else if(num==5){
        	System.out.println("��ѡ������Ȩ������Ϸ");
        }else if(num==6){
        	System.out.println("��ѡ������褽�����Ϸ");
        }else{
        	System.out.println("�����������");
        }
        System.out.print("��������Ķ��֣����ԣ��佫��ţ�");
        int num2=scan.nextInt();
        switch(num2){
            case  1: System.out.println("����ѡ��������������Ϸ");
            break;
            case  2: System.out.println("����ѡ�������ƽ�����Ϸ");
            break;
            case  3: System.out.println("����ѡ���˲ܲٽ�����Ϸ");
            break;
            case  4: System.out.println("����ѡ�����ĺ������Ϸ");
            break;
            case  5: System.out.println("����ѡ������Ȩ������Ϸ");
            break;
            case  6: System.out.println("����ѡ������褽�����Ϸ");
            break;
            default:System.out.println("�����������");
          }
        System.out.println("===========================");
        System.out.println("���Ƹ������");
        for(int j=1;j<=4;j++){
        	int ran=(int)(Math.random()*104+1);
        	System.out.print("[����"+j+"]:("+cardArray[ran][0]+")"+"\t"+cardArray[ran][1]+"\t");
        }
        System.out.println();
        System.out.println("���Ƹ�������");
        for(int j=1;j<=4;j++){
        	int ran=(int)(Math.random()*104);
        	System.out.print("[����"+j+"]:("+cardArray[ran][0]+")"+"\t"+cardArray[ran][1]+"\t");
        }
        System.out.println();
        
	}
}
