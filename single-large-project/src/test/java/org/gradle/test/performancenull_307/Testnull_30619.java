package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30619 {
    private final Productionnull_30619 production = new Productionnull_30619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}