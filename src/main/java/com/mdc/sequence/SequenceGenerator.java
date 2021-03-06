package com.mdc.sequence;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.sequence
 * @copyright Copyright (c) 2017
 * @date : 22.11.2017 20:55
 */
public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private int counter;
    public SequenceGenerator() {}
    public SequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        buffer.append(suffix);
        return buffer.toString();
    }
}
