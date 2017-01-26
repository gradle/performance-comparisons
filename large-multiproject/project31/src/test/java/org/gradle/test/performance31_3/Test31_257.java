package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_257 {
    private final Production31_257 production = new Production31_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}