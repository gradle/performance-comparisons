package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_456 {
    private final Production95_456 production = new Production95_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}