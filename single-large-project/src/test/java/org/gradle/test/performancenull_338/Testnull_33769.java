package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33769 {
    private final Productionnull_33769 production = new Productionnull_33769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}