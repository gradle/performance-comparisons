package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_180 {
    private final Production7_180 production = new Production7_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}