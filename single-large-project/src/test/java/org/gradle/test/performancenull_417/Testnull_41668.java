package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41668 {
    private final Productionnull_41668 production = new Productionnull_41668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}