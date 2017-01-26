package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_164 {
    private final Production4_164 production = new Production4_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}