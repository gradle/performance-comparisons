package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_454 {
    private final Production87_454 production = new Production87_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}