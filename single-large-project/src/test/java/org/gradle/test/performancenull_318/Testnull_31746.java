package org.gradle.test.performancenull_318;

import static org.junit.Assert.*;

public class Testnull_31746 {
    private final Productionnull_31746 production = new Productionnull_31746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}