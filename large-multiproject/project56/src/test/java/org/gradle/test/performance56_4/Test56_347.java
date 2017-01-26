package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_347 {
    private final Production56_347 production = new Production56_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}