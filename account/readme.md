``` 
SELECT
      auto_increment
   FROM information_schema.TABLES
   WHERE TABLE_SCHEMA = 'seata_order'
     AND TABLE_NAME = 'undo_log'
```
可以查看到undo_log表的主键有自增的记录