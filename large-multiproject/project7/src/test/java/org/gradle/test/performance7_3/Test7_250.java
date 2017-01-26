package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_250 {
    private final Production7_250 production = new Production7_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}