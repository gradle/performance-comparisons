package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21624 {
    private final Productionnull_21624 production = new Productionnull_21624("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}