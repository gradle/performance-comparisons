package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_331 {
    private final Production56_331 production = new Production56_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}