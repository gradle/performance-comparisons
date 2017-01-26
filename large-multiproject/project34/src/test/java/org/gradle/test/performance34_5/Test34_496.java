package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_496 {
    private final Production34_496 production = new Production34_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}