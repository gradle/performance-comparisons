package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28022 {
    private final Productionnull_28022 production = new Productionnull_28022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}