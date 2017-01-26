package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_192 {
    private final Production9_192 production = new Production9_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}