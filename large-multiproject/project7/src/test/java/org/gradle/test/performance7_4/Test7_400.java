package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_400 {
    private final Production7_400 production = new Production7_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}