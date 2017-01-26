package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30475 {
    private final Productionnull_30475 production = new Productionnull_30475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}