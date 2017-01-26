package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_454 {
    private final Production91_454 production = new Production91_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}