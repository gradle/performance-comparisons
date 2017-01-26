package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_459 {
    private final Production9_459 production = new Production9_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}