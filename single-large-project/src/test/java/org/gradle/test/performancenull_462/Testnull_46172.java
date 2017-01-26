package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46172 {
    private final Productionnull_46172 production = new Productionnull_46172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}