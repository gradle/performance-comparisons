package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_387 {
    private final Production9_387 production = new Production9_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}