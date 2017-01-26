package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_315 {
    private final Production58_315 production = new Production58_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}