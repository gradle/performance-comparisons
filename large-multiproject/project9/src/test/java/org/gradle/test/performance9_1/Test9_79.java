package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_79 {
    private final Production9_79 production = new Production9_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}