package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_130 {
    private final Production9_130 production = new Production9_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}