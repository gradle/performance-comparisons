package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_271 {
    private final Production9_271 production = new Production9_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}