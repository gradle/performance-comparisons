package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30470 {
    private final Productionnull_30470 production = new Productionnull_30470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}