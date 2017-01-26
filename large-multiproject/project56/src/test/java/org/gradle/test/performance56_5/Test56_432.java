package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_432 {
    private final Production56_432 production = new Production56_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}