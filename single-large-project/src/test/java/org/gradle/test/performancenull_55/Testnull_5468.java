package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5468 {
    private final Productionnull_5468 production = new Productionnull_5468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}