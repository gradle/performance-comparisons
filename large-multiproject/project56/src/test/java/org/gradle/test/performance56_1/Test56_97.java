package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_97 {
    private final Production56_97 production = new Production56_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}