package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_257 {
    private final Production56_257 production = new Production56_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}