package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47241 {
    private final Productionnull_47241 production = new Productionnull_47241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}