package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_230 {
    private final Production88_230 production = new Production88_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}