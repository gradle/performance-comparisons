package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_256 {
    private final Production7_256 production = new Production7_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}