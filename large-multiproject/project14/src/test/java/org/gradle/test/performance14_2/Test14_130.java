package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_130 {
    private final Production14_130 production = new Production14_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}