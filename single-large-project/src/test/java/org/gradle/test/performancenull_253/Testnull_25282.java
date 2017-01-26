package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25282 {
    private final Productionnull_25282 production = new Productionnull_25282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}