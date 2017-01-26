package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41445 {
    private final Productionnull_41445 production = new Productionnull_41445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}