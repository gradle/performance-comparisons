package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41863 {
    private final Productionnull_41863 production = new Productionnull_41863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}