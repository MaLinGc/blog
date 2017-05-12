package com.ml.common.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IdStrUtil {

    public static String getChannelLength(int length) {
        String init = "";
        for (int i = 0; i < length; i++) {
            init = "&nbsp;&nbsp;" + init;
        }
        if (length == 1)
            return "";
        return init;
    }

    public static String getIdString(long[] ids) {
        if (ids == null || ids.length == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (long id : ids)
            idsStr.append(id).append(",");
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String linkString(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(",");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();

    }

    public static String linkString(Collection<String> strs) {
        if (strs == null || strs.size() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(",");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();

    }

    public static String getMarkIdString(List<String> ids) {
        if (ids == null || ids.size() == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (int i = 0; i < ids.size(); i++) {
            if (i == ids.size() - 1)
                idsStr.append("'").append(ids.get(i)).append("'");
            else
                idsStr.append("'").append(ids.get(i)).append("',");
        }
        return idsStr.toString();
    }

    public static String getIdString(String[] ids) {
        if (ids == null || ids.length == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (String id : ids) {
            if (isNum(id)) {
                idsStr.append(id).append(",");
            }
        }
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String getIdString(Long[] ids) {
        if (ids == null || ids.length == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (Long id : ids) {
            if (id != null)
                idsStr.append(id).append(",");
        }
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String getIdString(List<Long> ids) {
        if (ids == null || ids.size() == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (long id : ids)
            idsStr.append(id).append(",");
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String getIntegerIdString(List<Integer> ids) {
        if (ids == null || ids.size() == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (long id : ids)
            idsStr.append(id).append(",");
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String getIdStringInt(Collection<Integer> ids) {
        if (ids == null || ids.size() == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (Integer id : ids) {
            if (id != null)
                idsStr.append(id).append(",");
        }
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String getIdStringInt(Integer[] ids) {
        if (ids == null || ids.length == 0)
            return "";
        StringBuilder idsStr = new StringBuilder();
        for (long id : ids)
            idsStr.append(id).append(",");
        return idsStr.deleteCharAt(idsStr.length() - 1).toString();
    }

    public static String connectString(List<String> strList) {
        if (strList == null || strList.size() == 0)
            return "";
        StringBuilder connectStr = new StringBuilder();
        for (String str : strList)
            connectStr.append("'").append(str).append("',");
        return connectStr.deleteCharAt(connectStr.length() - 1).toString();

    }

    public static String connectString(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder connectStr = new StringBuilder();
        for (String str : strs)
            connectStr.append("'").append(str).append("',");
        return connectStr.deleteCharAt(connectStr.length() - 1).toString();

    }
    
    public static String connectString(Collection<Integer> ids, Integer id) {
        if (ids == null || ids.size() == 0 || id == null)
            return "";
        StringBuilder sb = new StringBuilder();
        for (Integer cid : ids) {
            sb.append("(").append(cid).append(",").append(id).append("),");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String connectString(Integer id, Collection<Integer> ids) {
        if (ids == null || ids.size() == 0 || id == null)
            return "";
        StringBuilder sb = new StringBuilder();
        for (Integer cid : ids) {
            sb.append("(").append(id).append(",").append(cid).append("),");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static List<Integer> filterIntegerList(List<Integer> list) {
        if (list == null || list.size() == 0)
            return null;
        List<Integer> newList = new ArrayList<>();
        for (Integer id : list) {
            if (id != null)
                newList.add(id);
        }
        return newList;
    }

    public static List<String> filterStringList(List<String> list) {
        if (list == null || list.size() == 0)
            return null;
        List<String> newList = new ArrayList<>();
        for (String id : list) {
            if (StringUtils.hasText(id))
                newList.add(id);
        }
        return newList;
    }

    public static List<String> splitStr2List(String fieldContent, String split) {
        if (!StringUtils.hasText(fieldContent))
            return null;
        List<String> list = new ArrayList<>();
        Collections.addAll(list, fieldContent.split(split));
        return list;
    }

    public static boolean strContainsStr(String fieldContent, String split, String str) {
        return !(!StringUtils.hasText(fieldContent) || !StringUtils.hasText(split) || !StringUtils
                .hasText(str)) && Arrays.asList(fieldContent.split(split)).contains(str);
    }

    public static String getSplitStr(String str, String split, int index) {
        if (!StringUtils.hasText(str))
            return "";
        String[] strs = str.split(split);
        if (strs.length < index)
            return "";
        return strs[index - 1];
    }

    public static boolean isNum(String str) {
        return StringUtils.hasText(str) && (str.trim().matches("[0-9.]+") || str.trim().matches("\\-[0-9.]+"));
    }

}
