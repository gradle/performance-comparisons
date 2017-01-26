package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34209 {
    private final Productionnull_34209 production = new Productionnull_34209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}