package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_243 {
    private final Production58_243 production = new Production58_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}