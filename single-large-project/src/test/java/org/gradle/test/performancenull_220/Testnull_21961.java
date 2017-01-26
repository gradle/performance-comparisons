package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21961 {
    private final Productionnull_21961 production = new Productionnull_21961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}