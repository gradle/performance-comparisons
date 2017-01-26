package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_254 {
    private final Production9_254 production = new Production9_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}