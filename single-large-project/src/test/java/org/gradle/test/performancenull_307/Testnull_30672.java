package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30672 {
    private final Productionnull_30672 production = new Productionnull_30672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}