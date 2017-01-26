package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41477 {
    private final Productionnull_41477 production = new Productionnull_41477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}