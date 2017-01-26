package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_407 {
    private final Production9_407 production = new Production9_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}