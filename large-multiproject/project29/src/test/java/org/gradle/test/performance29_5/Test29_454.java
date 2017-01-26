package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_454 {
    private final Production29_454 production = new Production29_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}