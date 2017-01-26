package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_483 {
    private final Production9_483 production = new Production9_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}