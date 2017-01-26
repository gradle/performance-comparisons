package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_80 {
    private final Production56_80 production = new Production56_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}