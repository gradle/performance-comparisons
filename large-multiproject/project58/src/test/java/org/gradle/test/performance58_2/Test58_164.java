package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_164 {
    private final Production58_164 production = new Production58_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}