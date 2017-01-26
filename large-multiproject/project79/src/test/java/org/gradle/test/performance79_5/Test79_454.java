package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_454 {
    private final Production79_454 production = new Production79_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}