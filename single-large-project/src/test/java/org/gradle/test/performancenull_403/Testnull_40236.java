package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40236 {
    private final Productionnull_40236 production = new Productionnull_40236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}