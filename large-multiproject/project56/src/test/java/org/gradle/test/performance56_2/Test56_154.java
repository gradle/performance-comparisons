package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_154 {
    private final Production56_154 production = new Production56_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}