package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_213 {
    private final Production58_213 production = new Production58_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}