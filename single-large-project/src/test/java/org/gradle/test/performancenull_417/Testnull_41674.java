package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41674 {
    private final Productionnull_41674 production = new Productionnull_41674("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}