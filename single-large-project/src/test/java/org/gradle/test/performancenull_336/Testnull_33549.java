package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33549 {
    private final Productionnull_33549 production = new Productionnull_33549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}