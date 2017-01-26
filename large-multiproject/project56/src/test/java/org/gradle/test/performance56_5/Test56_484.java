package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_484 {
    private final Production56_484 production = new Production56_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}