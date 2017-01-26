package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_309 {
    private final Production58_309 production = new Production58_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}