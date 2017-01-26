package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49531 {
    private final Productionnull_49531 production = new Productionnull_49531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}