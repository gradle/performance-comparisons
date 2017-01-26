package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_257 {
    private final Production93_257 production = new Production93_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}