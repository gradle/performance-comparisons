package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30690 {
    private final Productionnull_30690 production = new Productionnull_30690("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}