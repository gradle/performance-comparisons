package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_334 {
    private final Production7_334 production = new Production7_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}