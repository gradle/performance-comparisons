package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_456 {
    private final Production2_456 production = new Production2_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}