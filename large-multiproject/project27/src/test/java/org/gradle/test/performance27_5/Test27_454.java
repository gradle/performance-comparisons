package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_454 {
    private final Production27_454 production = new Production27_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}