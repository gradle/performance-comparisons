package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_40 {
    private final Production56_40 production = new Production56_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}