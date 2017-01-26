package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_301 {
    private final Production7_301 production = new Production7_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}