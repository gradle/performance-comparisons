package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40203 {
    private final Productionnull_40203 production = new Productionnull_40203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}