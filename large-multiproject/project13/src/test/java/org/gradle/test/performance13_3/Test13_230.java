package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_230 {
    private final Production13_230 production = new Production13_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}