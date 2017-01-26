package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34609 {
    private final Productionnull_34609 production = new Productionnull_34609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}