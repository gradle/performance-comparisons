package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_385 {
    private final Production9_385 production = new Production9_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}