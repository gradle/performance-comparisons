package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_490 {
    private final Production9_490 production = new Production9_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}