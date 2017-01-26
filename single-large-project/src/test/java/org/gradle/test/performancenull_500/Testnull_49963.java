package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49963 {
    private final Productionnull_49963 production = new Productionnull_49963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}