package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_257 {
    private final Production75_257 production = new Production75_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}