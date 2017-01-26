package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13492 {
    private final Productionnull_13492 production = new Productionnull_13492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}