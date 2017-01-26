package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_130 {
    private final Production30_130 production = new Production30_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}