package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27084 {
    private final Productionnull_27084 production = new Productionnull_27084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}