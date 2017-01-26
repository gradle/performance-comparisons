package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37470 {
    private final Productionnull_37470 production = new Productionnull_37470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}