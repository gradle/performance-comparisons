package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_392 {
    private final Production56_392 production = new Production56_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}