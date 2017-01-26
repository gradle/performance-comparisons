package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_281 {
    private final Production56_281 production = new Production56_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}