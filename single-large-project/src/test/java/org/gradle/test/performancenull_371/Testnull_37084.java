package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37084 {
    private final Productionnull_37084 production = new Productionnull_37084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}