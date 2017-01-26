package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_222 {
    private final Production56_222 production = new Production56_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}