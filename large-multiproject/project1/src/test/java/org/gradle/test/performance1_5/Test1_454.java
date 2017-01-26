package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_454 {
    private final Production1_454 production = new Production1_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}