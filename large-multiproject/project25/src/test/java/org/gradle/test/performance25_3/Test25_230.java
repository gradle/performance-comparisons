package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_230 {
    private final Production25_230 production = new Production25_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}