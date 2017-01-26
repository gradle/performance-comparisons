package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41763 {
    private final Productionnull_41763 production = new Productionnull_41763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}