package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_225 {
    private final Production56_225 production = new Production56_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}