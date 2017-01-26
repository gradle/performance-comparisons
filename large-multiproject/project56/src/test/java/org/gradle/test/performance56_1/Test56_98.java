package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_98 {
    private final Production56_98 production = new Production56_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}