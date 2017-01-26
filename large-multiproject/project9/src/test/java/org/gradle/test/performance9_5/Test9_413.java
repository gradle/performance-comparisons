package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_413 {
    private final Production9_413 production = new Production9_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}