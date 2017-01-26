package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41606 {
    private final Productionnull_41606 production = new Productionnull_41606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}