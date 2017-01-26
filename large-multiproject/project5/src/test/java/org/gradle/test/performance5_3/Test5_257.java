package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_257 {
    private final Production5_257 production = new Production5_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}