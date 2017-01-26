package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_50 {
    private final Production9_50 production = new Production9_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}