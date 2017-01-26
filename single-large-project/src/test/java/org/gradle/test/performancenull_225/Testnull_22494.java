package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22494 {
    private final Productionnull_22494 production = new Productionnull_22494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}