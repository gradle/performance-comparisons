package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_81 {
    private final Production58_81 production = new Production58_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}