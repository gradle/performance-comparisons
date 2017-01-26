package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_292 {
    private final Production9_292 production = new Production9_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}