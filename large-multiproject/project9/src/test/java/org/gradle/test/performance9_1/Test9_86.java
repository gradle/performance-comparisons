package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_86 {
    private final Production9_86 production = new Production9_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}