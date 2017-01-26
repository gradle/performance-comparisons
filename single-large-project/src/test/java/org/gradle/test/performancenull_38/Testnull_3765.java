package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3765 {
    private final Productionnull_3765 production = new Productionnull_3765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}