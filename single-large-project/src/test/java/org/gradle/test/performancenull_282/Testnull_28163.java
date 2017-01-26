package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28163 {
    private final Productionnull_28163 production = new Productionnull_28163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}