package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41788 {
    private final Productionnull_41788 production = new Productionnull_41788("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}