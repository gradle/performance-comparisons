package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_176 {
    private final Production58_176 production = new Production58_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}