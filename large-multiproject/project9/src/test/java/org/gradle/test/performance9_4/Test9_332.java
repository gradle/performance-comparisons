package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_332 {
    private final Production9_332 production = new Production9_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}