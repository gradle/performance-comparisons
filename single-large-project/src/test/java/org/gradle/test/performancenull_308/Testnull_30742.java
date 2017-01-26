package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30742 {
    private final Productionnull_30742 production = new Productionnull_30742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}