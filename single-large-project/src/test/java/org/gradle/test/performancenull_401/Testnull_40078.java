package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40078 {
    private final Productionnull_40078 production = new Productionnull_40078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}