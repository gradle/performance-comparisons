package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_90 {
    private final Production58_90 production = new Production58_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}