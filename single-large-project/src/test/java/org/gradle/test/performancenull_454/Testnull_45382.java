package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45382 {
    private final Productionnull_45382 production = new Productionnull_45382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}