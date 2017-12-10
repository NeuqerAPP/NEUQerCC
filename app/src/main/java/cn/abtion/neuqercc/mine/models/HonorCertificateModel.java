package cn.abtion.neuqercc.mine.models;

/**
 * @author fhyPayaso
 * @since 2017/11/22 14:12
 * email fhyPayaso@qq.com
 */

public class HonorCertificateModel {

    private int order;
    private String gloryName;
    private String gloryTime;
    private String gloryPicUrl;


    /**
     * 获取荣誉序号
     * @return
     */

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * 获取赛事名称
     * @return
     */

    public String getGloryName() {
        return gloryName;
    }

    public void setGloryName(String gloryName){
        this.gloryName = gloryName;
    }


    /**
     * 获取获奖时间
     * @return
     */

    public String getGloryTime() {
        return gloryTime;
    }

    public void setGloryTime(String gloryTime) {

        this.gloryTime = gloryTime;
    }


    /**
     * 获取证书图片url
     * @return
     */

    public String getGloryPicUrl() {
        return gloryPicUrl;
    }

    public void setGloryPicUrl(String gloryPicUrl) {
        this.gloryPicUrl = gloryPicUrl;
    }

}
