package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_206 {
    private final Production9_206 production = new Production9_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}