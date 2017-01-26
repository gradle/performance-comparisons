package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_429 {
    private final Production9_429 production = new Production9_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}