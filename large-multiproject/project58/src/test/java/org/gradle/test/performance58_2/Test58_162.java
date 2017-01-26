package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_162 {
    private final Production58_162 production = new Production58_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}