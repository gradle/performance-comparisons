package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_456 {
    private final Production73_456 production = new Production73_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}