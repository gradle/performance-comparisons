package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_351 {
    private final Production9_351 production = new Production9_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}