package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8145 {
    private final Productionnull_8145 production = new Productionnull_8145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}