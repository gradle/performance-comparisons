package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_167 {
    private final Production56_167 production = new Production56_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}