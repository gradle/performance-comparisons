package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20136 {
    private final Productionnull_20136 production = new Productionnull_20136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}