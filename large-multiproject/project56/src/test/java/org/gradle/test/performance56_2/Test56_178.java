package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_178 {
    private final Production56_178 production = new Production56_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}