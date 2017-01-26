package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_301 {
    private final Production30_301 production = new Production30_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}