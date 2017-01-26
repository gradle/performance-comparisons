package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_376 {
    private final Production9_376 production = new Production9_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}