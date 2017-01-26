package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_456 {
    private final Production65_456 production = new Production65_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}