package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_11 {
    private final Production7_11 production = new Production7_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}