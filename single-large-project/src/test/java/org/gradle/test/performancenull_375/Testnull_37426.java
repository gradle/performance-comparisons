package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37426 {
    private final Productionnull_37426 production = new Productionnull_37426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}