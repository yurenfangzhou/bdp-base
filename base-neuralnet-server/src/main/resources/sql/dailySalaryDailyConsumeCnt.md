selectByBizDate
===
    select tmp.sjtname,sum(IFNULL(tmp.daily_consume_cnt,0)) daily_consume_cnt
	from (select #use("cols")# from daily_salary_daily_consume_cnt  where sjtname not in ("H","J") and id in
	(select max(id) from daily_salary_daily_consume_cnt where biz_date=#bizDate# GROUP BY sjtname)) tmp
	GROUP BY tmp.sjtname

cols
===
	id,(case WHEN sjtname = "FG" then "FII" else sjtname end ) sjtname,daily_consume_cnt

	