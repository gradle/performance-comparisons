package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_181 {
    private final Production58_181 production = new Production58_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}