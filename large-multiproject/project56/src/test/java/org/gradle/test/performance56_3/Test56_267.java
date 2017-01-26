package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_267 {
    private final Production56_267 production = new Production56_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}