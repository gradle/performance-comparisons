package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_168 {
    private final Production56_168 production = new Production56_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}