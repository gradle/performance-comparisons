package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_390 {
    private final Production56_390 production = new Production56_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}