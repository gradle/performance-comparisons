package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_456 {
    private final Production97_456 production = new Production97_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}