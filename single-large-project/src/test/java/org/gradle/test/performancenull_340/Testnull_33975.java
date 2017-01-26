package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33975 {
    private final Productionnull_33975 production = new Productionnull_33975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}