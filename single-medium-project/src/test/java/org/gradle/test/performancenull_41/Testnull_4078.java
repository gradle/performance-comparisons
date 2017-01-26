package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4078 {
    private final Productionnull_4078 production = new Productionnull_4078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}