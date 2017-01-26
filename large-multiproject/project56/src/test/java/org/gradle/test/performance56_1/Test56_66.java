package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_66 {
    private final Production56_66 production = new Production56_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}