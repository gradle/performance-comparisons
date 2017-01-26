package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40220 {
    private final Productionnull_40220 production = new Productionnull_40220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}