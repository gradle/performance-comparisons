package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34255 {
    private final Productionnull_34255 production = new Productionnull_34255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}