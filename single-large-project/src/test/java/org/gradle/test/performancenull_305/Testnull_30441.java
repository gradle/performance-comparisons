package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30441 {
    private final Productionnull_30441 production = new Productionnull_30441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}