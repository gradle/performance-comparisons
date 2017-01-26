package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_107 {
    private final Production56_107 production = new Production56_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}