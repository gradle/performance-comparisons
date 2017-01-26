package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_272 {
    private final Production7_272 production = new Production7_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}