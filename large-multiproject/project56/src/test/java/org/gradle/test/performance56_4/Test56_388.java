package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_388 {
    private final Production56_388 production = new Production56_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}