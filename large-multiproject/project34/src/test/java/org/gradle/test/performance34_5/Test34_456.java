package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_456 {
    private final Production34_456 production = new Production34_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}