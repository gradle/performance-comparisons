package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_350 {
    private final Production56_350 production = new Production56_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}