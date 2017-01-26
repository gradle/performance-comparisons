package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_452 {
    private final Production9_452 production = new Production9_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}