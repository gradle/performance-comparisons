package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_257 {
    private final Production89_257 production = new Production89_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}