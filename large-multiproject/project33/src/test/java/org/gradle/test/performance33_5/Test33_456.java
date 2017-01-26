package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_456 {
    private final Production33_456 production = new Production33_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}