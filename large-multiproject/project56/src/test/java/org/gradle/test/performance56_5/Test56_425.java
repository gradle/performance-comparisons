package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_425 {
    private final Production56_425 production = new Production56_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}