package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28154 {
    private final Productionnull_28154 production = new Productionnull_28154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}