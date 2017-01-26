package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_188 {
    private final Production58_188 production = new Production58_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}