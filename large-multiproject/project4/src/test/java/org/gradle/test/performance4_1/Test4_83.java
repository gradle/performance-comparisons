package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_83 {
    private final Production4_83 production = new Production4_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}