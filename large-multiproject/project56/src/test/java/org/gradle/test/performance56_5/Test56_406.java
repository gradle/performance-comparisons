package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_406 {
    private final Production56_406 production = new Production56_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}