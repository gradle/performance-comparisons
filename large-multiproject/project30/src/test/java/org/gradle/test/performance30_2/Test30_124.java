package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_124 {
    private final Production30_124 production = new Production30_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}