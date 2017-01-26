package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_93 {
    private final Production56_93 production = new Production56_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}