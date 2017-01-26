package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_106 {
    private final Production56_106 production = new Production56_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}