package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21619 {
    private final Productionnull_21619 production = new Productionnull_21619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}