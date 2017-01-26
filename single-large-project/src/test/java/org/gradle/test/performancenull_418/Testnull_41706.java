package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41706 {
    private final Productionnull_41706 production = new Productionnull_41706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}