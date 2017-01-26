package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20825 {
    private final Productionnull_20825 production = new Productionnull_20825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}