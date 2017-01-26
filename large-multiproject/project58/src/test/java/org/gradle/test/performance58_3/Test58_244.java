package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_244 {
    private final Production58_244 production = new Production58_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}