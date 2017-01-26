package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_470 {
    private final Production7_470 production = new Production7_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}