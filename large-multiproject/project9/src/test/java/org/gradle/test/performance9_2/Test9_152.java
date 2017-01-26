package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_152 {
    private final Production9_152 production = new Production9_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}