package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_242 {
    private final Production80_242 production = new Production80_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}