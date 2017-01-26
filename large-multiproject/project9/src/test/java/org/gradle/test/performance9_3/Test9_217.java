package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_217 {
    private final Production9_217 production = new Production9_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}