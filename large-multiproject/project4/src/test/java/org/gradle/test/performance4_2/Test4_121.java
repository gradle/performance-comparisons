package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_121 {
    private final Production4_121 production = new Production4_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}