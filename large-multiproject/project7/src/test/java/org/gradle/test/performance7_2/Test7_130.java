package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_130 {
    private final Production7_130 production = new Production7_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}