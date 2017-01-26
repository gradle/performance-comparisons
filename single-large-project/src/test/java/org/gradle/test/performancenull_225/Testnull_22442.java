package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22442 {
    private final Productionnull_22442 production = new Productionnull_22442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}