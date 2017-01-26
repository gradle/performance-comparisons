package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_83 {
    private final Production9_83 production = new Production9_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}