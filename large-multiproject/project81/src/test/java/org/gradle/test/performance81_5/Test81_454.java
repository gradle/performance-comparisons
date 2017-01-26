package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_454 {
    private final Production81_454 production = new Production81_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}