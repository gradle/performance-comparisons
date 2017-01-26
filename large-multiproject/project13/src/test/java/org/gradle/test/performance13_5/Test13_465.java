package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_465 {
    private final Production13_465 production = new Production13_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}