package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_305 {
    private final Production56_305 production = new Production56_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}