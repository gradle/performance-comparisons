package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_49 {
    private final Production56_49 production = new Production56_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}