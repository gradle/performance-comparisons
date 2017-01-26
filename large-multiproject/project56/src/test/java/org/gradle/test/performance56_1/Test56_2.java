package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_2 {
    private final Production56_2 production = new Production56_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}