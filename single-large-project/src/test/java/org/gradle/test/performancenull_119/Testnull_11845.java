package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11845 {
    private final Productionnull_11845 production = new Productionnull_11845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}