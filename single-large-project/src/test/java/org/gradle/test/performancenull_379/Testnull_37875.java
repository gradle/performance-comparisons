package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37875 {
    private final Productionnull_37875 production = new Productionnull_37875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}