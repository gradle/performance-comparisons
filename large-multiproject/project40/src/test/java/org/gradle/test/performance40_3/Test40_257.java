package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_257 {
    private final Production40_257 production = new Production40_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}