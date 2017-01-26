package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_272 {
    private final Production26_272 production = new Production26_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}