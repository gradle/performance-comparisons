package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_288 {
    private final Production56_288 production = new Production56_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}