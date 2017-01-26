package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_294 {
    private final Production13_294 production = new Production13_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}