package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_438 {
    private final Production9_438 production = new Production9_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}