package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18765 {
    private final Productionnull_18765 production = new Productionnull_18765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}