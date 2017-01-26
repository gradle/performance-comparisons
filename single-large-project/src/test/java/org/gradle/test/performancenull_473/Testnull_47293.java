package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47293 {
    private final Productionnull_47293 production = new Productionnull_47293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}