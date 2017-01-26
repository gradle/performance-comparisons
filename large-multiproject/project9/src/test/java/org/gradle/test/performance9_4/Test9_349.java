package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_349 {
    private final Production9_349 production = new Production9_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}