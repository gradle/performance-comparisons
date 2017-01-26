package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4766 {
    private final Productionnull_4766 production = new Productionnull_4766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}