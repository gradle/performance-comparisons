package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_157 {
    private final Production56_157 production = new Production56_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}