package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_27000 {
    private final Productionnull_27000 production = new Productionnull_27000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}