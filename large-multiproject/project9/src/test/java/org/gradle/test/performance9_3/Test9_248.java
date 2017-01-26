package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_248 {
    private final Production9_248 production = new Production9_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}