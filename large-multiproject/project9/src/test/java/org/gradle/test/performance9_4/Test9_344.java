package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_344 {
    private final Production9_344 production = new Production9_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}