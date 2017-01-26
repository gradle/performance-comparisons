package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_230 {
    private final Production47_230 production = new Production47_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}