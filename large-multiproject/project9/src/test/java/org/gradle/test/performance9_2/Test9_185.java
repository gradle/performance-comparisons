package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_185 {
    private final Production9_185 production = new Production9_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}