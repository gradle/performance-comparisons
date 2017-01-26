package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_166 {
    private final Production56_166 production = new Production56_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}