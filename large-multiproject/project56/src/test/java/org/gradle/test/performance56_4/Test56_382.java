package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_382 {
    private final Production56_382 production = new Production56_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}