package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_10 {
    private final Production56_10 production = new Production56_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}