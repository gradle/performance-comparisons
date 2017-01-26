package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41825 {
    private final Productionnull_41825 production = new Productionnull_41825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}