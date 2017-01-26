package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25931 {
    private final Productionnull_25931 production = new Productionnull_25931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}