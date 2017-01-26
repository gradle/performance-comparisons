package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_297 {
    private final Production13_297 production = new Production13_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}