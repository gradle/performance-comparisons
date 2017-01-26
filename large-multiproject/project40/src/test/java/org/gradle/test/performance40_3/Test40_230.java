package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_230 {
    private final Production40_230 production = new Production40_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}