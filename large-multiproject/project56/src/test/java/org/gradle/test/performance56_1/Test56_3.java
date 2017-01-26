package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_3 {
    private final Production56_3 production = new Production56_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}