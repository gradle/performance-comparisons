package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_156 {
    private final Production9_156 production = new Production9_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}