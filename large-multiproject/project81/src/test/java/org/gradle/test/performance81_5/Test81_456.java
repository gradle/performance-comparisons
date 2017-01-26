package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_456 {
    private final Production81_456 production = new Production81_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}