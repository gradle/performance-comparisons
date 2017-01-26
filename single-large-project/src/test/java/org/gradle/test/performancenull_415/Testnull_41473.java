package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41473 {
    private final Productionnull_41473 production = new Productionnull_41473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}