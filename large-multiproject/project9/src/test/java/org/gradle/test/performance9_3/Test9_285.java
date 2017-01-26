package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_285 {
    private final Production9_285 production = new Production9_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}