package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_112 {
    private final Production56_112 production = new Production56_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}