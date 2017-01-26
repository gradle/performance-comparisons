package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_454 {
    private final Production71_454 production = new Production71_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}