package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_334 {
    private final Production9_334 production = new Production9_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}