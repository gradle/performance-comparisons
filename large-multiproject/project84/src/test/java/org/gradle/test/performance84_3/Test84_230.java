package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_230 {
    private final Production84_230 production = new Production84_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}