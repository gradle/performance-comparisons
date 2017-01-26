package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_257 {
    private final Production8_257 production = new Production8_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}