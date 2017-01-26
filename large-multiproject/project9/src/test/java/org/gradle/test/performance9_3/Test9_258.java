package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_258 {
    private final Production9_258 production = new Production9_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}