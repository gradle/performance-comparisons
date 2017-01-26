package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4225 {
    private final Productionnull_4225 production = new Productionnull_4225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}