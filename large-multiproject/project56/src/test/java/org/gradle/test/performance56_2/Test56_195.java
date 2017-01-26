package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_195 {
    private final Production56_195 production = new Production56_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}