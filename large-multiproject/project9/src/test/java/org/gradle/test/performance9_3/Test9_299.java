package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_299 {
    private final Production9_299 production = new Production9_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}