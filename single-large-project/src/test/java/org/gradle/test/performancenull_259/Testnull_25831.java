package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25831 {
    private final Productionnull_25831 production = new Productionnull_25831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}