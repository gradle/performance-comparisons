package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_469 {
    private final Production7_469 production = new Production7_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}