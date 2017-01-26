package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30783 {
    private final Productionnull_30783 production = new Productionnull_30783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}