package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_24 {
    private final Production7_24 production = new Production7_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}