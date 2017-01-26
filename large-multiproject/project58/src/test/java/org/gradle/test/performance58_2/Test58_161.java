package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_161 {
    private final Production58_161 production = new Production58_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}