package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20160 {
    private final Productionnull_20160 production = new Productionnull_20160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}