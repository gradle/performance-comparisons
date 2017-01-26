package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_184 {
    private final Production9_184 production = new Production9_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}