package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_432 {
    private final Production13_432 production = new Production13_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}