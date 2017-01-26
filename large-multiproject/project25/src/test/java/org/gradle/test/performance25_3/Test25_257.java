package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_257 {
    private final Production25_257 production = new Production25_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}