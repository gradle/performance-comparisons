package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_294 {
    private final Production56_294 production = new Production56_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}