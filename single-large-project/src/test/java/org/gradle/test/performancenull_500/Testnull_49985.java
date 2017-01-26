package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49985 {
    private final Productionnull_49985 production = new Productionnull_49985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}