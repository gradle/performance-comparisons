package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_454 {
    private final Production59_454 production = new Production59_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}