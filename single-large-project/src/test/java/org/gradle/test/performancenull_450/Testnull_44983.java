package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44983 {
    private final Productionnull_44983 production = new Productionnull_44983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}