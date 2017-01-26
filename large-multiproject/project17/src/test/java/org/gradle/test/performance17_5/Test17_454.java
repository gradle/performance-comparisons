package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_454 {
    private final Production17_454 production = new Production17_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}