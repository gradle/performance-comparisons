package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40235 {
    private final Productionnull_40235 production = new Productionnull_40235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}