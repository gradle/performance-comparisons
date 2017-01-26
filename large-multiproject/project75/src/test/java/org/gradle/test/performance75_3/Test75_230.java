package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_230 {
    private final Production75_230 production = new Production75_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}