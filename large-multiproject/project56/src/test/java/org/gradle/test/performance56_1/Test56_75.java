package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_75 {
    private final Production56_75 production = new Production56_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}