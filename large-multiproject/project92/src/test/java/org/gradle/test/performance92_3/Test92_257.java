package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_257 {
    private final Production92_257 production = new Production92_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}