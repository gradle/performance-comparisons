package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_272 {
    private final Production18_272 production = new Production18_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}