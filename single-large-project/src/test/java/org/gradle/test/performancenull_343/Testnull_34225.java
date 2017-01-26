package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34225 {
    private final Productionnull_34225 production = new Productionnull_34225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}