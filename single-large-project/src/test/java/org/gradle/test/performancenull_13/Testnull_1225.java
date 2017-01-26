package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1225 {
    private final Productionnull_1225 production = new Productionnull_1225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}