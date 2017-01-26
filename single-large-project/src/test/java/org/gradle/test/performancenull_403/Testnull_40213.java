package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40213 {
    private final Productionnull_40213 production = new Productionnull_40213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}