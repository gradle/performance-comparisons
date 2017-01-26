package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20147 {
    private final Productionnull_20147 production = new Productionnull_20147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}