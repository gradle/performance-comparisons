package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_120 {
    private final Production7_120 production = new Production7_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}