package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_338 {
    private final Production56_338 production = new Production56_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}