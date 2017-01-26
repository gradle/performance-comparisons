package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_120 {
    private final Production9_120 production = new Production9_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}