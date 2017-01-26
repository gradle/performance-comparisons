package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_143 {
    private final Production58_143 production = new Production58_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}