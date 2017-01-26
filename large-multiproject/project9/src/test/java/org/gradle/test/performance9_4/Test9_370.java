package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_370 {
    private final Production9_370 production = new Production9_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}