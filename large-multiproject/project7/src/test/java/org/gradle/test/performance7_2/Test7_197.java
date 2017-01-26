package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_197 {
    private final Production7_197 production = new Production7_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}