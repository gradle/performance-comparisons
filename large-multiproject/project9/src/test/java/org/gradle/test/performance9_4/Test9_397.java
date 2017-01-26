package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_397 {
    private final Production9_397 production = new Production9_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}