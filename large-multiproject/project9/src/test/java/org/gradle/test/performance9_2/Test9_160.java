package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_160 {
    private final Production9_160 production = new Production9_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}