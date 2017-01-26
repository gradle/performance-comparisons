package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_202 {
    private final Production56_202 production = new Production56_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}