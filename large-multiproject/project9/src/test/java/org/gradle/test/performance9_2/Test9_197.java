package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_197 {
    private final Production9_197 production = new Production9_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}