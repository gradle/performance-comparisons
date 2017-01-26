package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43781 {
    private final Productionnull_43781 production = new Productionnull_43781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}