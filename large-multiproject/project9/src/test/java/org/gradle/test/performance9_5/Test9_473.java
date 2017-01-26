package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_473 {
    private final Production9_473 production = new Production9_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}