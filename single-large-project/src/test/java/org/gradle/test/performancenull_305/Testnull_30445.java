package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30445 {
    private final Productionnull_30445 production = new Productionnull_30445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}