package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35980 {
    private final Productionnull_35980 production = new Productionnull_35980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}