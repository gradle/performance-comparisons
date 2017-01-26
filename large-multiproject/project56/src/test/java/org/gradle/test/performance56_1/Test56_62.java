package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_62 {
    private final Production56_62 production = new Production56_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}