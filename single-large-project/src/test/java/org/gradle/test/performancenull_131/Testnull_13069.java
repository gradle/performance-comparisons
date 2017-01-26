package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13069 {
    private final Productionnull_13069 production = new Productionnull_13069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}