package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34771 {
    private final Productionnull_34771 production = new Productionnull_34771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}