package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_190 {
    private final Production58_190 production = new Production58_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}