package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34488 {
    private final Productionnull_34488 production = new Productionnull_34488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}