package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_480 {
    private final Production9_480 production = new Production9_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}