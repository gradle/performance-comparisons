package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_58 {
    private final Production56_58 production = new Production56_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}