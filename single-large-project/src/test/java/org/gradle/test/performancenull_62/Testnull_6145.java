package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6145 {
    private final Productionnull_6145 production = new Productionnull_6145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}