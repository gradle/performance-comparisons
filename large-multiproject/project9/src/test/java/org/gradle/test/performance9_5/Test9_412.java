package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_412 {
    private final Production9_412 production = new Production9_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}