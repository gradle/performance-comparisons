package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_272 {
    private final Production63_272 production = new Production63_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}