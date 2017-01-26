package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_250 {
    private final Production9_250 production = new Production9_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}