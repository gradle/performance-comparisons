package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41648 {
    private final Productionnull_41648 production = new Productionnull_41648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}