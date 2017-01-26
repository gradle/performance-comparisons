package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25868 {
    private final Productionnull_25868 production = new Productionnull_25868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}