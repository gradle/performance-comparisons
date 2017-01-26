package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_68 {
    private final Production56_68 production = new Production56_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}