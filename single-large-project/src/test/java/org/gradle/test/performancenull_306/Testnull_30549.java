package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30549 {
    private final Productionnull_30549 production = new Productionnull_30549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}