package commonFunctions;

import java.util.HashMap;
import java.util.Map;

public class mapHelper {

    public static String mapEntry(String category){
        Map<String, String> entryMap = new HashMap<>();
        entryMap.put("income","income");
        entryMap.put("expense","expense");
        return entryMap.get(category.trim().toLowerCase());
    }
    public static String mapCategory(String category){
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("savings","Savings");
        categoryMap.put("salary","Salary");
        categoryMap.put("deposits","Deposits");
        categoryMap.put("bills","Bills");
        categoryMap.put("car","Car");
        categoryMap.put("clothes","Clothes");
        categoryMap.put("communications","Communications");
        categoryMap.put("eating out","Eating out");
        categoryMap.put("entertainment","Entertainment");
        categoryMap.put("food","Food");
        categoryMap.put("gifts","Gifts");
        categoryMap.put("health","Health");
        categoryMap.put("house","House");
        categoryMap.put("pets","Pets");
        categoryMap.put("sports","Sports");
        categoryMap.put("taxi","Taxi");
        categoryMap.put("toiletry","Toiletry");
        categoryMap.put("transport","Transport");
        return categoryMap.get(category.trim().toLowerCase());
    }
    public static String mapPeriod(String period){
        Map<String, String> periodMap = new HashMap<>();
        periodMap.put("day","day");
        periodMap.put("week","week");
        periodMap.put("month","month");
        periodMap.put("year","year");
        periodMap.put("all","all");
        return periodMap.get(period.trim().toLowerCase());
    }
    public static String mapCurrency(String category){
        Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("PHP","₱");
        return currencyMap.get(category.trim().toLowerCase());
    }
}
