package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_493 {
    private final Production9_493 production = new Production9_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}