package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_17 {
    private final Production56_17 production = new Production56_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}