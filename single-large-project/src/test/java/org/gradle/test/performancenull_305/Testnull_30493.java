package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30493 {
    private final Productionnull_30493 production = new Productionnull_30493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}