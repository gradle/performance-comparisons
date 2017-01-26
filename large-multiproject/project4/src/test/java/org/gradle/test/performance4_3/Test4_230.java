package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_230 {
    private final Production4_230 production = new Production4_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}