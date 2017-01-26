package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_272 {
    private final Production99_272 production = new Production99_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}