package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49981 {
    private final Productionnull_49981 production = new Productionnull_49981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}