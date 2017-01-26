package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_496 {
    private final Production53_496 production = new Production53_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}