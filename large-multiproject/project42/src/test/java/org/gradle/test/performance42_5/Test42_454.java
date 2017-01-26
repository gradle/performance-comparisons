package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_454 {
    private final Production42_454 production = new Production42_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}