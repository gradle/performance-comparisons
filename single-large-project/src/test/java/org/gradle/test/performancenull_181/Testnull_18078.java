package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18078 {
    private final Productionnull_18078 production = new Productionnull_18078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}