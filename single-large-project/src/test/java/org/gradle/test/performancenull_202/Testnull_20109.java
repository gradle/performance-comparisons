package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20109 {
    private final Productionnull_20109 production = new Productionnull_20109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}