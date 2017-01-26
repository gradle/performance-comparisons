package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_487 {
    private final Production9_487 production = new Production9_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}