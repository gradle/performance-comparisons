package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_91 {
    private final Production56_91 production = new Production56_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}