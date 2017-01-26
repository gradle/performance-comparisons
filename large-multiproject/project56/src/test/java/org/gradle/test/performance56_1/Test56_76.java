package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_76 {
    private final Production56_76 production = new Production56_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}