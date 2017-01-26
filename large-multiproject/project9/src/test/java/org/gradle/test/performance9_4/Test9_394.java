package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_394 {
    private final Production9_394 production = new Production9_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}