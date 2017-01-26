package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41845 {
    private final Productionnull_41845 production = new Productionnull_41845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}