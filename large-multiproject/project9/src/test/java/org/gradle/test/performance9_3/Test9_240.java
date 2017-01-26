package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_240 {
    private final Production9_240 production = new Production9_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}