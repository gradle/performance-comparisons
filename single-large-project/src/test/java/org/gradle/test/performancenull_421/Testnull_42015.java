package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42015 {
    private final Productionnull_42015 production = new Productionnull_42015("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}