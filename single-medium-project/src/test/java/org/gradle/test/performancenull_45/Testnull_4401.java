package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4401 {
    private final Productionnull_4401 production = new Productionnull_4401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}