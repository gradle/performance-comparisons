package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_400 {
    private final Production4_400 production = new Production4_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}