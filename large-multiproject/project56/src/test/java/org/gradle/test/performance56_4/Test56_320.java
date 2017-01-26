package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_320 {
    private final Production56_320 production = new Production56_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}