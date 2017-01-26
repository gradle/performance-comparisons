package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_124 {
    private final Production9_124 production = new Production9_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}