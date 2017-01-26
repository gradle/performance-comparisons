package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_39 {
    private final Production56_39 production = new Production56_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}