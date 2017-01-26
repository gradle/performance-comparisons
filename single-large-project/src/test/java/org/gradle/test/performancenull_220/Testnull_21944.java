package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21944 {
    private final Productionnull_21944 production = new Productionnull_21944("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}