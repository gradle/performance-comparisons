package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36466 {
    private final Productionnull_36466 production = new Productionnull_36466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}