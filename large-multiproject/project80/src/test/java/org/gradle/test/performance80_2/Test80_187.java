package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_187 {
    private final Production80_187 production = new Production80_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}