package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_143 {
    private final Production80_143 production = new Production80_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}