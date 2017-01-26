package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_230 {
    private final Production80_230 production = new Production80_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}