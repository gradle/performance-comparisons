package org.gradle.test.performancenull_489;

import static org.junit.Assert.*;

public class Testnull_48873 {
    private final Productionnull_48873 production = new Productionnull_48873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}