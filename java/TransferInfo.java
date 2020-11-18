package com.project;

public class TransferInfo 
{
	public String[] transInfo(int startDate,int endDate,String age,String loc,int sex,int flc)
	{
		String[] list = new String[6];

        switch (startDate) 
        {
            case 201901:  list[0] = "1월";
                     break;
            case 201902:  list[0] = "2월";
                     break;
            case 201903:  list[0] = "3월";
                     break;
            case 201904:  list[0] = "4월";
                     break;
            case 201905:  list[0] = "5월";
                     break;
            case 201906:  list[0] = "6월";
                     break;
            case 201907:  list[0] = "7월";
                     break;
            case 201908:  list[0] = "8월";
                     break;
            case 201909:  list[0] = "9월";
                     break;
            case 201910: list[0] = "10월";
                     break;
            case 201911: list[0] = "11월";
                     break;
            case 201912: list[0] = "12월";
                     break;
        }
        switch (endDate) 
        {
            case 201901:  list[1] = "1월";
                     break;
            case 201902:  list[1] = "2월";
                     break;
            case 201903:  list[1] = "3월";
                     break;
            case 201904:  list[1] = "4월";
                     break;
            case 201905:  list[1] = "5월";
                     break;
            case 201906:  list[1] = "6월";
                     break;
            case 201907:  list[1] = "7월";
                     break;
            case 201908:  list[1] = "8월";
                     break;
            case 201909:  list[1] = "9월";
                     break;
            case 201910: list[1] = "10월";
                     break;
            case 201911: list[1] = "11월";
                     break;
            case 201912: list[1] = "12월";
                     break;
        }
		switch (sex) 
		{
			case 1:  list[2] = "남자";
			break;
			case 2:  list[2] = "여자";
			break;
		}
		switch (flc) 
		{
			case 1:  list[3] = "1인가구";
			break;
			case 2:  list[3] = "영유아자녀가구";
			break;
			case 3:  list[3] = "중고생자녀가구";
			break;
			case 4:  list[3] = "성인자녀가구";
			break;
			case 5:  list[3] = "노년가구";
			break;
		}
		if(age.equals("10s"))
		{
			list[4]="10대";
		}
		else if(age.equals("20s"))
		{
			list[4]="20대";
		}
		else if(age.equals("30s"))
		{
			list[4]="30대";
		}
		else if(age.equals("40s"))
		{
			list[4]="40대";
		}
		else if(age.equals("50s"))
		{
			list[4]="50대";
		}
		else if(age.equals("60s"))
		{
			list[4]="60대";
		}
		else
		{
			list[4]="70대";
		}
		
		if(loc.equals("seoul"))
		{
			list[5]="서울";
		}
		else if(loc.equals("daegu"))
		{
			list[5]="대구";
		}
		else if(loc.equals("jeonnam"))
		{
			list[5]="전남";
		}
		else if(loc.equals("jeonbuk"))
		{
			list[5]="전북";
		}
		else if(loc.equals("gyeonggi"))
		{
			list[5]="경기";
		}
		else if(loc.equals("chungnam"))
		{
			list[5]="충남";
		}
		else if(loc.equals("gyeongnam"))
		{
			list[5]="경남";
		}
		else if(loc.equals("sejong"))
		{
			list[5]="세종";
		}
		else if(loc.equals("busan"))
		{
			list[5]="부산";
		}
		else if(loc.equals("incheon"))
		{
			list[5]="인천";
		}
		else if(loc.equals("jeju"))
		{
			list[5]="제주";
		}
		else if(loc.equals("chungbuk"))
		{
			list[5]="충북";
		}
		else if(loc.equals("gangwon"))
		{
			list[5]="강원";
		}
		else if(loc.equals("daejeon"))
		{
			list[5]="대전";
		}
		else
		{
			list[5]="경북";
		}
		
		
		return list;
	}

}
