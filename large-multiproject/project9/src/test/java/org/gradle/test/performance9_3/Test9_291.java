package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_291 {
    private final Production9_291 production = new Production9_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}