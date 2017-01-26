package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_298 {
    private final Production9_298 production = new Production9_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}