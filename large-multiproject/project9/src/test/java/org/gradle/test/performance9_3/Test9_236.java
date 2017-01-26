package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_236 {
    private final Production9_236 production = new Production9_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}