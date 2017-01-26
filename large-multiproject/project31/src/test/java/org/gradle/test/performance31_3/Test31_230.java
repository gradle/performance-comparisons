package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_230 {
    private final Production31_230 production = new Production31_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}