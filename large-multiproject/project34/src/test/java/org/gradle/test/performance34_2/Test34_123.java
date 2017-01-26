package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_123 {
    private final Production34_123 production = new Production34_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}