package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_9 {
    private final Production56_9 production = new Production56_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}