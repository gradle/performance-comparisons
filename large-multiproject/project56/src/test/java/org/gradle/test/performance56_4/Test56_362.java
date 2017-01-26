package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_362 {
    private final Production56_362 production = new Production56_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}