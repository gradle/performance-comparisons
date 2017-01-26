package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_339 {
    private final Production4_339 production = new Production4_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}