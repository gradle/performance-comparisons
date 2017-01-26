package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_51 {
    private final Production56_51 production = new Production56_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}