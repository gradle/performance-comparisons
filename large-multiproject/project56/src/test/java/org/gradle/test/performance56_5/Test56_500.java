package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_500 {
    private final Production56_500 production = new Production56_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}