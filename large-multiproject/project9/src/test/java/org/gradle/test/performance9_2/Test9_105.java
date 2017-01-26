package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_105 {
    private final Production9_105 production = new Production9_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}