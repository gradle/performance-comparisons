package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_77 {
    private final Production56_77 production = new Production56_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}