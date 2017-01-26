package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37421 {
    private final Productionnull_37421 production = new Productionnull_37421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}