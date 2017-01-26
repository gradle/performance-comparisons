package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_174 {
    private final Production56_174 production = new Production56_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}