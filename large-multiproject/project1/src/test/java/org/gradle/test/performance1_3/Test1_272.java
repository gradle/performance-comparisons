package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_272 {
    private final Production1_272 production = new Production1_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}