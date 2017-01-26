package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_14 {
    private final Production56_14 production = new Production56_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}