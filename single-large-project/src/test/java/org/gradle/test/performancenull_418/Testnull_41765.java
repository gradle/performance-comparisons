package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41765 {
    private final Productionnull_41765 production = new Productionnull_41765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}