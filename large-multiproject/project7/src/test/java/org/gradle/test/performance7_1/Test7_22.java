package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_22 {
    private final Production7_22 production = new Production7_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}