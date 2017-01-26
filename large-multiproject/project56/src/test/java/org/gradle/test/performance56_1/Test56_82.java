package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_82 {
    private final Production56_82 production = new Production56_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}