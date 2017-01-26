package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_454 {
    private final Production11_454 production = new Production11_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}