package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_400 {
    private final Production9_400 production = new Production9_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}