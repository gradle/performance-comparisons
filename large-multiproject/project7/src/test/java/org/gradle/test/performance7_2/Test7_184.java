package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_184 {
    private final Production7_184 production = new Production7_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}