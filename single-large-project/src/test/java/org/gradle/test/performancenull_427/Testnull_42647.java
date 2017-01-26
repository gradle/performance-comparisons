package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42647 {
    private final Productionnull_42647 production = new Productionnull_42647("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}