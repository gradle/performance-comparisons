package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5432 {
    private final Productionnull_5432 production = new Productionnull_5432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}