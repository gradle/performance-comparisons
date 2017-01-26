package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1172 {
    private final Productionnull_1172 production = new Productionnull_1172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}