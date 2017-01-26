package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_23 {
    private final Production9_23 production = new Production9_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}