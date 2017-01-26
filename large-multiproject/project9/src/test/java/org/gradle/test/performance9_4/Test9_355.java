package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_355 {
    private final Production9_355 production = new Production9_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}