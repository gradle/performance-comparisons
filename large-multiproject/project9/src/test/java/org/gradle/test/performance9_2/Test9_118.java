package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_118 {
    private final Production9_118 production = new Production9_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}