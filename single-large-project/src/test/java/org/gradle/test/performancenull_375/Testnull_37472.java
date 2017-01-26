package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37472 {
    private final Productionnull_37472 production = new Productionnull_37472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}