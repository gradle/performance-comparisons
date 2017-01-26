package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_470 {
    private final Production9_470 production = new Production9_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}