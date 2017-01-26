package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42879 {
    private final Productionnull_42879 production = new Productionnull_42879("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}