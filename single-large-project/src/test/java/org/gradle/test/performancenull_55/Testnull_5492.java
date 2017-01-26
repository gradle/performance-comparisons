package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5492 {
    private final Productionnull_5492 production = new Productionnull_5492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}