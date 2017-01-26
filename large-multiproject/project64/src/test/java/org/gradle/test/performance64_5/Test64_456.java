package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_456 {
    private final Production64_456 production = new Production64_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}