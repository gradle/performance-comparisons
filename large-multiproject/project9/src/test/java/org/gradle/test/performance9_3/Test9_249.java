package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_249 {
    private final Production9_249 production = new Production9_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}