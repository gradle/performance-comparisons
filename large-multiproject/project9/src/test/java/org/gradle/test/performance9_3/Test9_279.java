package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_279 {
    private final Production9_279 production = new Production9_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}