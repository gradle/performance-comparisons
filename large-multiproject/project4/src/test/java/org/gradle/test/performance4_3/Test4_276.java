package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_276 {
    private final Production4_276 production = new Production4_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}