package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_468 {
    private final Production7_468 production = new Production7_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}