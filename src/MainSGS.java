import java.util.Scanner;
public class MainSGS {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        System.out.println("=========欢迎来到迷你版三国杀=========");
        System.out.println("======================================");
        System.out.println("三国杀是一款以三国题材为背景的桌游");
        System.out.println("迷你版三国杀是一款以Java开发的控制台游戏程序");
        System.out.println("----武将列表----");
        int cardcount=104;
        String[][] cardArray=new String[104][2];
        for(int j=0;j<cardcount;j++){
        	if(j<42){
        		if(j<21){
        		     cardArray[j][0]="黑桃";
        		}else{
        			 cardArray[j][0]="梅花";
        		}
        		cardArray[j][1]="杀";
        	}else if(j<84){
        		cardArray[j][0]="方块";
        		cardArray[j][1]="闪";
        	}else if(j<cardcount){
        		cardArray[j][0]="红桃";
        		cardArray[j][1]="桃";
        		}
        }
        String[][] wujiangArray={{"刘备","4","仁德"},{"赵云","4","龙胆"},
        		                {"曹操","4","奸雄"},{"夏侯淳","4","刚烈"},
        		                 {"孙权","4","制衡"},{"周瑜","3","反间"}};
        for(int i=0;i<wujiangArray.length;i++){
        	System.out.println((i+1)+"."+wujiangArray[i][0]+
        	                      "\t血量："+wujiangArray[i][1]+"\t技能："+wujiangArray[i][2]);
        }
        System.out.print("请输入要选择的武将名字序号:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num==1){
        	System.out.println("你选择了刘备进行游戏");
        }else if(num==2){
        	System.out.println("你选择了赵云进行游戏");
        }else if(num==3){
        	System.out.println("你选择了曹操进行游戏");
        }else if(num==4){
        	System.out.println("你选择了夏侯淳进行游戏");
        }else if(num==5){
        	System.out.println("你选择了孙权进行游戏");
        }else if(num==6){
        	System.out.println("你选择了周瑜进行游戏");
        }else{
        	System.out.println("你的输入有误");
        }
        System.out.print("请输入你的对手（电脑）武将序号：");
        int num2=scan.nextInt();
        switch(num2){
            case  1: System.out.println("对手选择了刘备进行游戏");
            break;
            case  2: System.out.println("对手选择了赵云进行游戏");
            break;
            case  3: System.out.println("对手选择了曹操进行游戏");
            break;
            case  4: System.out.println("对手选择了夏侯淳进行游戏");
            break;
            case  5: System.out.println("对手选择了孙权进行游戏");
            break;
            case  6: System.out.println("对手选择了周瑜进行游戏");
            break;
            default:System.out.println("你的输入有误");
          }
        System.out.println("===========================");
        System.out.println("发牌给：玩家");
        for(int j=1;j<=4;j++){
        	int ran=(int)(Math.random()*104+1);
        	System.out.print("[卡牌"+j+"]:("+cardArray[ran][0]+")"+"\t"+cardArray[ran][1]+"\t");
        }
        System.out.println();
        System.out.println("发牌给：对手");
        for(int j=1;j<=4;j++){
        	int ran=(int)(Math.random()*104);
        	System.out.print("[卡牌"+j+"]:("+cardArray[ran][0]+")"+"\t"+cardArray[ran][1]+"\t");
        }
        System.out.println();
        
	}
}
