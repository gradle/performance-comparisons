package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_215 {
    private final Production56_215 production = new Production56_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}