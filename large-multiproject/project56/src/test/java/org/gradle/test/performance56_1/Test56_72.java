package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_72 {
    private final Production56_72 production = new Production56_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}