package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_272 {
    private final Production14_272 production = new Production14_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}