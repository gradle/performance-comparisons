package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_484 {
    private final Production80_484 production = new Production80_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}