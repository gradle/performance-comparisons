package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_201 {
    private final Production9_201 production = new Production9_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}