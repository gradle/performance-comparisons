package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_458 {
    private final Production56_458 production = new Production56_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}