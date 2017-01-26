package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_428 {
    private final Production9_428 production = new Production9_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}