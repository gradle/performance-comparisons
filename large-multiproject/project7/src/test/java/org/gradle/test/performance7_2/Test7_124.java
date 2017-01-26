package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_124 {
    private final Production7_124 production = new Production7_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}