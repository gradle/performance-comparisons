package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_273 {
    private final Production9_273 production = new Production9_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}