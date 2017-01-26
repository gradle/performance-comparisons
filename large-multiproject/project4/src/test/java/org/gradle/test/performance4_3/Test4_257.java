package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_257 {
    private final Production4_257 production = new Production4_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}