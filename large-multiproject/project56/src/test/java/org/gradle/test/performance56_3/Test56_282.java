package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_282 {
    private final Production56_282 production = new Production56_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}