package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_433 {
    private final Production9_433 production = new Production9_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}