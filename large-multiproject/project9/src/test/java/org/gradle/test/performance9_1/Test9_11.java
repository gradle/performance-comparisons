package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_11 {
    private final Production9_11 production = new Production9_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}