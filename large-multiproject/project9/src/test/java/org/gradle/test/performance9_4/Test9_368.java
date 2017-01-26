package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_368 {
    private final Production9_368 production = new Production9_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}