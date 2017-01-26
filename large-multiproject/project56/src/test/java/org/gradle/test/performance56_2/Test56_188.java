package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_188 {
    private final Production56_188 production = new Production56_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}