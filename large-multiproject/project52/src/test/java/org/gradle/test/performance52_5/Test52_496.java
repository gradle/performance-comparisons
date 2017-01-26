package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_496 {
    private final Production52_496 production = new Production52_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}