package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_341 {
    private final Production7_341 production = new Production7_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}