package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_238 {
    private final Production56_238 production = new Production56_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}