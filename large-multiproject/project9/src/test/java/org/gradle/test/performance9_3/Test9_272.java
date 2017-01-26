package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_272 {
    private final Production9_272 production = new Production9_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}