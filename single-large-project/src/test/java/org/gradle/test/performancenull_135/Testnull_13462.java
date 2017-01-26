package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13462 {
    private final Productionnull_13462 production = new Productionnull_13462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}