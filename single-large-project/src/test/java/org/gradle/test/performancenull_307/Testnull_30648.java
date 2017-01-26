package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30648 {
    private final Productionnull_30648 production = new Productionnull_30648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}