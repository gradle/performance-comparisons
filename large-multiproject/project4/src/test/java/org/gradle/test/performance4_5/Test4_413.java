package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_413 {
    private final Production4_413 production = new Production4_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}