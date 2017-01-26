package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30647 {
    private final Productionnull_30647 production = new Productionnull_30647("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}