package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_434 {
    private final Production56_434 production = new Production56_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}