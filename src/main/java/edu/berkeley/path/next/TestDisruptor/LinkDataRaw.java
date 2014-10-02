package edu.berkeley.path.next.TestDisruptor;

import java.io.Serializable;

/**
 * Created by mauricemanning on 9/16/14.
 */
public class LinkDataRaw implements Serializable{


    private double  networkid;
    private double  linkid;
    private double  capacity;
    private double  runid;
    private double  vehiclecount;
    private double speed;
    private double lanes;
    private double laneOffset;
    private double length;
    private String typeName;
    private long typeId;
    private String linkName;
    private long beginNodeId;
    private long endNodeId;
    private boolean isSource;
    private boolean isSink;
    private boolean isValid;

    private java.util.List<String> roadNames;
    private java.util.List<Point> points;

    public boolean getIsSource() {
        return isSource;
    }
    public void setIsSource(boolean isSource) {
        this.isSource = isSource;
    }

    public boolean getIsSink() {
        return isSink;
    }
    public void setIsSink(boolean isSink) {
        this.isSink = isSink;
    }

    public boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(boolean isSink) {
        this.isValid = isValid;
    }

    public java.util.List<String> getRoadNames() {
        return roadNames;
    }
    public void setRoadNames(java.util.List<String> roadNames) {
        this.roadNames = roadNames;
    }

    public java.util.List<Point> getPoints() {
        return points;
    }
    public void setPoints(java.util.List<Point> roadNames) {
        this.points = points;
    }


    public long getEndNodeId() {
        return endNodeId;
    }
    public void setEndNodeId(long endNodeId) {
        this.endNodeId = endNodeId;
    }

    public long getBeginNodeId() {
        return beginNodeId;
    }
    public void setBeginNodeId(long beginNodeId) {
        this.beginNodeId = beginNodeId;
    }

    public String getLinkName() {
        return linkName;
    }
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public long getTypeId() {
        return typeId;
    }
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getLaneOffset() {
        return laneOffset;
    }
    public void setLaneOffset(double laneOffset) {
        this.laneOffset = laneOffset;
    }

    public double getLanes() {
        return lanes;
    }
    public void setLanes(double lanes) {
        this.lanes = lanes;
    }

    public double getNetworkid() {
        return networkid;
    }
    public void setNetworkid(double networkid) {
        this.networkid = networkid;
    }

    public double getLinkid() {
        return linkid;
    }
    public void setLinkid(double linkid) {
        this.linkid = linkid;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) { this.capacity = capacity;}

    public double getRunid() {
        return runid;
    }
    public void setRunid(double runid) { this.runid = runid;}

    public double getVehiclecount() {
        return vehiclecount;
    }
    public void setVehiclecount(double vehiclecount) { this.vehiclecount = vehiclecount;}

    public double getSpeedLimit() { return speed; }
    public void setSpeedLimit(double speed) { this.speed = speed; }


}
