package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_257 {
    private final Production16_257 production = new Production16_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}