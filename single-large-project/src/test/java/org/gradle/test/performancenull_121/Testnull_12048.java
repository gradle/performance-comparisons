package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12048 {
    private final Productionnull_12048 production = new Productionnull_12048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}