package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_177 {
    private final Production9_177 production = new Production9_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}