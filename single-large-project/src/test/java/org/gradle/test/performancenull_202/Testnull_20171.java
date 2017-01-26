package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20171 {
    private final Productionnull_20171 production = new Productionnull_20171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}