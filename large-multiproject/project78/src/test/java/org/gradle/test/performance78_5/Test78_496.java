package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_496 {
    private final Production78_496 production = new Production78_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}