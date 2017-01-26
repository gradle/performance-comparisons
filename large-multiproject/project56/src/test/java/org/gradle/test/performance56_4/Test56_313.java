package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_313 {
    private final Production56_313 production = new Production56_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}