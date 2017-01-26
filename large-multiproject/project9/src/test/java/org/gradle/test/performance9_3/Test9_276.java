package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_276 {
    private final Production9_276 production = new Production9_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}