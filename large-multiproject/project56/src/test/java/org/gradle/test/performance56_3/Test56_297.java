package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_297 {
    private final Production56_297 production = new Production56_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}