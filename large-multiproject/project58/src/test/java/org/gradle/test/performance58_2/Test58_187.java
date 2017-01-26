package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_187 {
    private final Production58_187 production = new Production58_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}