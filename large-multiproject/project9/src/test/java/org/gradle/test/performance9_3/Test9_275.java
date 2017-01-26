package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_275 {
    private final Production9_275 production = new Production9_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}