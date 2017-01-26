package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38549 {
    private final Productionnull_38549 production = new Productionnull_38549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}