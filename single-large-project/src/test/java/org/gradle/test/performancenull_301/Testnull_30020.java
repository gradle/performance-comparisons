package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30020 {
    private final Productionnull_30020 production = new Productionnull_30020("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}