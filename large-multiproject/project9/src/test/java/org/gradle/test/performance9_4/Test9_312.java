package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_312 {
    private final Production9_312 production = new Production9_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}