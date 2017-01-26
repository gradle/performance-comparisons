package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_193 {
    private final Production9_193 production = new Production9_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}