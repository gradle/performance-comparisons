package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_349 {
    private final Production7_349 production = new Production7_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}