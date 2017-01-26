package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30673 {
    private final Productionnull_30673 production = new Productionnull_30673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}