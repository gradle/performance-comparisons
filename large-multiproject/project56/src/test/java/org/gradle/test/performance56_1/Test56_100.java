package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_100 {
    private final Production56_100 production = new Production56_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}