package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42289 {
    private final Productionnull_42289 production = new Productionnull_42289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}