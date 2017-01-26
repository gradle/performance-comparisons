package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_207 {
    private final Production56_207 production = new Production56_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}