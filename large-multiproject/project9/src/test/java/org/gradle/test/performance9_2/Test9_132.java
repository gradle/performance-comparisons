package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_132 {
    private final Production9_132 production = new Production9_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}