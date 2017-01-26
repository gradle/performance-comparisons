package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37884 {
    private final Productionnull_37884 production = new Productionnull_37884("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}