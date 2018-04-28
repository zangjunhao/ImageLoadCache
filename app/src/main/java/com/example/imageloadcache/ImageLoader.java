package com.example.imageloadcache;

/**
 * Created by 67698 on 2018/4/28.
 */

public class ImageLoader {
    private static final String TAG="ImageLoader";
    public static final int MESSAGE_RESULT=1;
    private static final int CPU_COUNT=Runtime.getRuntime().availableProcessors();//获取cup数量
    private static final int CPRE_POOL_SIZE=CPU_COUNT+1;//核心线程要比cpu数多一个
    private static final int MAXIMUM_POOL_SIZE=CPU_COUNT*2+1;//线程池最大线程数量等于核心线程的两倍多一个
    private static final long KEEP_ALIVE=10L;//线程的最长等待时间，long赋值后面需要加L
    private static final int TAG_KEY_URI=R.id.load;//获取Imageview的key(不过我还是第一次知道布局id是int型)
    private static final long DISK_CACHE_SIZE=1024*1024*50;//最大缓存为50MB(因为内存的基本单位是b)
    private static final int IO_BUFFER_SIZE =8*1024;//流内最大缓存量
    private static final int DISK_CACHE_INDEX=0;//缓存指针
    private boolean mIsDiskLruCacheCreated=false;//默认不打开磁盘存储

}
