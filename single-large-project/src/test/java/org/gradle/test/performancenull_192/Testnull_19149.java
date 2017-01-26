package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19149 {
    private final Productionnull_19149 production = new Productionnull_19149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}