package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_481 {
    private final Production56_481 production = new Production56_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}