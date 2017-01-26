package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4579 {
    private final Productionnull_4579 production = new Productionnull_4579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}