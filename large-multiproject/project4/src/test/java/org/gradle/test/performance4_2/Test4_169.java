package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_169 {
    private final Production4_169 production = new Production4_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}