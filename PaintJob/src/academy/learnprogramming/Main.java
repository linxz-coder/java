package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double totalBucket = Math.ceil(width * height / areaPerBucket);
        int needBucket = (int)totalBucket - extraBuckets;
        return needBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalBucket = Math.ceil(width * height / areaPerBucket);
        int needBucket = (int)totalBucket;
        return needBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalBucket = Math.ceil(area / areaPerBucket);
        int needBucket = (int)totalBucket;
        return needBucket;
    }
}
