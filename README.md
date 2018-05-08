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
      {
        BitmapFactory.Options options = new BitmapFactory.Options();  
        options.inJustDecodeBounds = true;  
        Bitmap bitmap = BitmapFactory.decodeStream(is, null, options);  
        int inSampleSize = calculateInSampleSize(options,getReqWidth(),getReqHeight());  
        //设置计算得到的压缩比例  
        options.inSampleSize = 4;//这里简单做一下宽高都缩小4倍操作，项目中应计算得到压缩比例  
        //设置为false，确保可以得到bitmap != null  
        options.inJustDecodeBounds = false;  
        bitmap = BitmapFactory.decodeByteArray(data, 0, data.length, options);  }
## 感悟
### 我是真的菜
