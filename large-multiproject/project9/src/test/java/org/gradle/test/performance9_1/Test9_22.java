package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_22 {
    private final Production9_22 production = new Production9_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}