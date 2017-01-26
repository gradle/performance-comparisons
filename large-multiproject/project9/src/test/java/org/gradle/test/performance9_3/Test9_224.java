package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_224 {
    private final Production9_224 production = new Production9_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}