package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_219 {
    private final Production56_219 production = new Production56_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}