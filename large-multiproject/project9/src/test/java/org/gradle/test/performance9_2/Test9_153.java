package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_153 {
    private final Production9_153 production = new Production9_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}