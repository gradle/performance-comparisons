package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_498 {
    private final Production56_498 production = new Production56_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}