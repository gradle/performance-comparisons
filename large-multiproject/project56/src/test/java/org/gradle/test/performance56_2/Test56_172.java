package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_172 {
    private final Production56_172 production = new Production56_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}