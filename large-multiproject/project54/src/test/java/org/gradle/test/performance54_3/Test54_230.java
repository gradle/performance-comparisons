package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_230 {
    private final Production54_230 production = new Production54_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}