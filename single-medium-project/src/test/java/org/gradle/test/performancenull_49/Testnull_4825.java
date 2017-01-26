package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4825 {
    private final Productionnull_4825 production = new Productionnull_4825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}