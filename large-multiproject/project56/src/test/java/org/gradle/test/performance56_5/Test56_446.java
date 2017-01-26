package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_446 {
    private final Production56_446 production = new Production56_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}