package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_456 {
    private final Production59_456 production = new Production59_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}