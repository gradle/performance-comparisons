package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_83 {
    private final Production84_83 production = new Production84_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}