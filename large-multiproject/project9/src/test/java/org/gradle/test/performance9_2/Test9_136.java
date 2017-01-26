package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_136 {
    private final Production9_136 production = new Production9_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}