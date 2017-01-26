package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_491 {
    private final Production15_491 production = new Production15_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}