package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_228 {
    private final Production56_228 production = new Production56_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}