package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41470 {
    private final Productionnull_41470 production = new Productionnull_41470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}