package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7180 {
    private final Productionnull_7180 production = new Productionnull_7180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}