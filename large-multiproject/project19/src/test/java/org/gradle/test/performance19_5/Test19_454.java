package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_454 {
    private final Production19_454 production = new Production19_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}