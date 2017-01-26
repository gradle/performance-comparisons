package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41006 {
    private final Productionnull_41006 production = new Productionnull_41006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}