package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_96 {
    private final Production56_96 production = new Production56_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}