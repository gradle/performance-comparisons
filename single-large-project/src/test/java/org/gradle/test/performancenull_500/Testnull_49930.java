package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49930 {
    private final Productionnull_49930 production = new Productionnull_49930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}