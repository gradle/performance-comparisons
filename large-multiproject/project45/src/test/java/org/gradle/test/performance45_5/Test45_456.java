package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_456 {
    private final Production45_456 production = new Production45_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}