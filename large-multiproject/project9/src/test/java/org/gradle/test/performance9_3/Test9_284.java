package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_284 {
    private final Production9_284 production = new Production9_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}