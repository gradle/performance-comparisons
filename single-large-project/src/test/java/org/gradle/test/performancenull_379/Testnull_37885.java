package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37885 {
    private final Productionnull_37885 production = new Productionnull_37885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}