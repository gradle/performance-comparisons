package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_384 {
    private final Production9_384 production = new Production9_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}