package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30683 {
    private final Productionnull_30683 production = new Productionnull_30683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}