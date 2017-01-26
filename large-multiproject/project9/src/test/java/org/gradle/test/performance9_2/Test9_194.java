package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_194 {
    private final Production9_194 production = new Production9_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}