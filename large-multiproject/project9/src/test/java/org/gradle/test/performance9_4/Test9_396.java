package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_396 {
    private final Production9_396 production = new Production9_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}