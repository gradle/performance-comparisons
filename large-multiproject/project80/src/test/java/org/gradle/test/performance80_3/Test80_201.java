package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_201 {
    private final Production80_201 production = new Production80_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}