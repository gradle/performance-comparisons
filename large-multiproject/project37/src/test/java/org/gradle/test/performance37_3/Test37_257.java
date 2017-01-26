package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_257 {
    private final Production37_257 production = new Production37_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}