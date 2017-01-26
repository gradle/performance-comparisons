package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27078 {
    private final Productionnull_27078 production = new Productionnull_27078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}