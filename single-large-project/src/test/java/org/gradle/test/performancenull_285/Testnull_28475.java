package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28475 {
    private final Productionnull_28475 production = new Productionnull_28475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}