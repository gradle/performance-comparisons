package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_478 {
    private final Production9_478 production = new Production9_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}