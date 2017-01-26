package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_173 {
    private final Production56_173 production = new Production56_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}