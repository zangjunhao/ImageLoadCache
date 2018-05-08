# 图片加载和三级缓存
## 主要内容
- LruCache的使用
- 对于File类的使用
- 对于线程池的使用 (兰儿我还是不懂
- BitmapFactory的使用和理解
- 其实主要就是线程池那点很难理解
## 缓存
- LruCache用来内存缓存
- 通过本地创建文件的方法来实现本地缓存
- 网络加载着没有什么说的 (强行三级
## 修改——2018.5.8
- 1.本地加载时设置判断再存入内存
- 2.图片压缩中对流的处理，因为如果就是平时的代码 
-    ` {
        BitmapFactory.Options options = new BitmapFactory.Options();  
        options.inJustDecodeBounds = true;  
        BitmapFactory.decodeStream(inputstream, null, options);  
        options.inSampleSize = CalculateInsampleSize(options,reqWidth,reqHeight);
        options.inJustDecodeBounds = false;  
       return BitmapFactory.decodeStream(inputstream, null, options);  
        }`
   ， 会发现返回是null，因为inputstream只能用一次，之前测的时候用了一次，所以后inputsteam就没有了，处理方法是将流转化陈byte数组就可以重复用了
- 3.将自动clear本地缓存删除了，需要手动设置清除缓存了    
## 感悟
### 我是真的菜
