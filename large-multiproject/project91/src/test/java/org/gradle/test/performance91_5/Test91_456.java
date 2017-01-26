package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_456 {
    private final Production91_456 production = new Production91_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}