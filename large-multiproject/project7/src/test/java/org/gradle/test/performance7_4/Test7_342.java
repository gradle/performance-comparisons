package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_342 {
    private final Production7_342 production = new Production7_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}