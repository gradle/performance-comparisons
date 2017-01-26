package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16845 {
    private final Productionnull_16845 production = new Productionnull_16845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}