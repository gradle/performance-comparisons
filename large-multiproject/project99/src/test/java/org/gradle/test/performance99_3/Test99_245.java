package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_245 {
    private final Production99_245 production = new Production99_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}