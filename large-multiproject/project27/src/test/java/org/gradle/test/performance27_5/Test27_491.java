package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_491 {
    private final Production27_491 production = new Production27_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}