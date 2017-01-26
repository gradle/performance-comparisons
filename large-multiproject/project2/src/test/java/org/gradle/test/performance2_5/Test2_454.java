package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_454 {
    private final Production2_454 production = new Production2_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}