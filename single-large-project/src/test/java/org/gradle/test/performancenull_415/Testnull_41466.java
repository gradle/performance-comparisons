package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41466 {
    private final Productionnull_41466 production = new Productionnull_41466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}