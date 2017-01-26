package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_349 {
    private final Production4_349 production = new Production4_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}