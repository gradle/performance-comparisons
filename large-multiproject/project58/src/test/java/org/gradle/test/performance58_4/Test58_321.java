package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_321 {
    private final Production58_321 production = new Production58_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}