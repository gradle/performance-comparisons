package org.gradle.test.performancenull_465;

import static org.junit.Assert.*;

public class Testnull_46465 {
    private final Productionnull_46465 production = new Productionnull_46465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}