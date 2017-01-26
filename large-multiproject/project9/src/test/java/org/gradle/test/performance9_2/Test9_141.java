package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_141 {
    private final Production9_141 production = new Production9_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}