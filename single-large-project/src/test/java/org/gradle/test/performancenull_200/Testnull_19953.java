package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19953 {
    private final Productionnull_19953 production = new Productionnull_19953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}