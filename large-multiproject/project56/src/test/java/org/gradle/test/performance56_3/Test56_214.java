package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_214 {
    private final Production56_214 production = new Production56_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}