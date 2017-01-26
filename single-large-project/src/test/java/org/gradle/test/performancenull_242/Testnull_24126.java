package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24126 {
    private final Productionnull_24126 production = new Productionnull_24126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}