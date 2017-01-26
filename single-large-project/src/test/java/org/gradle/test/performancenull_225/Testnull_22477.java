package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22477 {
    private final Productionnull_22477 production = new Productionnull_22477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}