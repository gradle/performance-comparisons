package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20129 {
    private final Productionnull_20129 production = new Productionnull_20129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}