package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36735 {
    private final Productionnull_36735 production = new Productionnull_36735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}