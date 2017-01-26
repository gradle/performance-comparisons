package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30501 {
    private final Productionnull_30501 production = new Productionnull_30501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}