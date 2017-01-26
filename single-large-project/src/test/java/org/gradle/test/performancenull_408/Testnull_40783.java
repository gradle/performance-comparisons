package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40783 {
    private final Productionnull_40783 production = new Productionnull_40783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}