package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41680 {
    private final Productionnull_41680 production = new Productionnull_41680("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}