package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_339 {
    private final Production9_339 production = new Production9_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}