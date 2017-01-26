package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_212 {
    private final Production56_212 production = new Production56_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}