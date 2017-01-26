package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_319 {
    private final Production9_319 production = new Production9_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}