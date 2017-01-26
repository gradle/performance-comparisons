package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41869 {
    private final Productionnull_41869 production = new Productionnull_41869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}