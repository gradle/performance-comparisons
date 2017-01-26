package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_286 {
    private final Production58_286 production = new Production58_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}