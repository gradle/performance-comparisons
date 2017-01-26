package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41026 {
    private final Productionnull_41026 production = new Productionnull_41026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}