package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_114 {
    private final Production56_114 production = new Production56_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}