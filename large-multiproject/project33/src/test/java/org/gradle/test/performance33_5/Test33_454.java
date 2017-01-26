package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_454 {
    private final Production33_454 production = new Production33_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}