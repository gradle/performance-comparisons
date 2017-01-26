package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_452 {
    private final Production7_452 production = new Production7_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}