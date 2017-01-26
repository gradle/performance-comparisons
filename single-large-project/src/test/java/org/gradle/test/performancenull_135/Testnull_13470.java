package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13470 {
    private final Productionnull_13470 production = new Productionnull_13470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}