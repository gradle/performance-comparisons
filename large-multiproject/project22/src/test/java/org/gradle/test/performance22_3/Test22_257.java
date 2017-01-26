package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_257 {
    private final Production22_257 production = new Production22_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}