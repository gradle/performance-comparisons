package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_101 {
    private final Production9_101 production = new Production9_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}