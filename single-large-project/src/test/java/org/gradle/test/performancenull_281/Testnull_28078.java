package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28078 {
    private final Productionnull_28078 production = new Productionnull_28078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}