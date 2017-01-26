package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5971 {
    private final Productionnull_5971 production = new Productionnull_5971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}