package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_456 {
    private final Production29_456 production = new Production29_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}