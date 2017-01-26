package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_409 {
    private final Production9_409 production = new Production9_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}