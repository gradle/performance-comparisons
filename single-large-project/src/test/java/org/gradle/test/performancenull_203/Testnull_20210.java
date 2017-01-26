package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20210 {
    private final Productionnull_20210 production = new Productionnull_20210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}