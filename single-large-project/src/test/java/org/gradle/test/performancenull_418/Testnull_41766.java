package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41766 {
    private final Productionnull_41766 production = new Productionnull_41766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}