package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_94 {
    private final Production9_94 production = new Production9_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}