package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_256 {
    private final Production4_256 production = new Production4_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}