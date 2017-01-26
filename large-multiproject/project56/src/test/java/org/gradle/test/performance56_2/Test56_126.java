package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_126 {
    private final Production56_126 production = new Production56_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}