package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_193 {
    private final Production7_193 production = new Production7_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}