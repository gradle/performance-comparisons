package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_340 {
    private final Production7_340 production = new Production7_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}