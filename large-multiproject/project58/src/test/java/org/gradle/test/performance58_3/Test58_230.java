package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_230 {
    private final Production58_230 production = new Production58_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}