package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_287 {
    private final Production9_287 production = new Production9_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}