package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41663 {
    private final Productionnull_41663 production = new Productionnull_41663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}