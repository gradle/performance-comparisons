package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25753 {
    private final Productionnull_25753 production = new Productionnull_25753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}