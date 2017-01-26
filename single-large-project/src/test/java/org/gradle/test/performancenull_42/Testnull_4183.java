package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4183 {
    private final Productionnull_4183 production = new Productionnull_4183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}