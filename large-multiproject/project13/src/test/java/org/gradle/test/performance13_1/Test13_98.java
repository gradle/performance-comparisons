package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_98 {
    private final Production13_98 production = new Production13_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}