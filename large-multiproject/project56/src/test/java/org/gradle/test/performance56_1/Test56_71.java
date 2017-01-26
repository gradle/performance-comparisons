package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_71 {
    private final Production56_71 production = new Production56_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}