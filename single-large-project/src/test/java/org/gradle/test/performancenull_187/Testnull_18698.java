package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18698 {
    private final Productionnull_18698 production = new Productionnull_18698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}