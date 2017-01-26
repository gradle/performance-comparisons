package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_257 {
    private final Production98_257 production = new Production98_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}