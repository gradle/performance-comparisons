package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30472 {
    private final Productionnull_30472 production = new Productionnull_30472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}