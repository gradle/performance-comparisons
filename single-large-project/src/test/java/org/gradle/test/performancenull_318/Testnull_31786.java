package org.gradle.test.performancenull_318;

import static org.junit.Assert.*;

public class Testnull_31786 {
    private final Productionnull_31786 production = new Productionnull_31786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}