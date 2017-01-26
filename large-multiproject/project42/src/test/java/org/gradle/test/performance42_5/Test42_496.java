package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_496 {
    private final Production42_496 production = new Production42_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}