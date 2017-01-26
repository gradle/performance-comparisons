package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_324 {
    private final Production56_324 production = new Production56_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}